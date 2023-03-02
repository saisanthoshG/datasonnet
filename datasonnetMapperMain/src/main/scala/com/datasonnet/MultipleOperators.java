package com.datasonnet;
import fansi.Str;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

public class MultipleOperators {
    public static String ParseDWCode (String script) {
        String header = "";
        String body = "";
        String []x;
        x = script.split("---");
        header = x[0];
        try {
            body = bodyParse(x[1].trim());
        }catch(Exception e){
            System.out.println("error");
        }
        System.out.println("HEADER:\n"+header+"BODY:\n"+body);
        return null;
    }
    public static void main(String args[]) throws Exception{
        //\"CeilVal\": ds.strings.capitalize(ds.trim(\" abc   \"))\n"
        String script1 = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "  \"Val1\": pluralize      ( capitalize  ( trim \" abc   \" ) ),\n\n\n\n" +
                "  \"Val2\": pluralize  ( capitalize  ( trim \" abc   \"  ) )\n" +
                "}";
        String script = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "  \"Val1\":  ceil  ( min [1,2,3,4] ) ,\n\n\n\n" +
                "  \"Val2\": ceil  ( min  [1,2,3,4] )\n" +
                "}";
        ParseDWCode(script);
    }
    /*    public static String callBack(String s){
            if(s.indexOf("(")!=-1){
                //Operatorss fn call
            }
            return null;
        }
        A(b(c(d())))  1 3 5 78 9 10 11
        A(b(c("ds.()"),d()))  1 3 5  13 14 15*/
    public static String bodyParse(String body1) throws Exception {
        if (body1.startsWith("{") && body1.endsWith("}")) {
            body1 = body1.substring(1, body1.length() - 1);
            System.out.println("----");
        }
        body1 = body1.trim();
        String mop[];
        HashMap<String, String> map = new HashMap<String, String>();
        String me = null;
        if (body1.contains(",\n")) {//need to handle else case for single key value pair
            mop = body1.split(",\n");
            int fl = 0;
            for (String body : mop
            ) {
                //System.out.println(body.trim());
                // System.out.println(s.trim().indexOf(':'));
                //--------------------------------------------
                int x = body.indexOf(':');
                int len = body.length();
                String strkey = body.substring(0, x).trim();
                String str = body.substring(x + 1, len).trim();
                System.out.println(str + "----" + str);
                map.put(strkey, str);
                Stack<String> st = new Stack<String>();
                st.push(str);
                String in1;
                int i = 0;
                while (st.peek().contains("(")) { //( to check nested functionalities
                    in1 = st.peek();   //  ( trim " abc   " )
                    i++;
                    System.out.println(in1);
                    if (in1.startsWith("(") && in1.endsWith(")")) {
                        st.pop();
                        in1 = in1.substring(1, in1.length() - 1).trim();          // trim " abc   "
                        st.push(in1);
                    }
                    if (in1.contains("(") && in1.contains(")")) {
                        String in2 = in1.substring(in1.indexOf("("), in1.lastIndexOf(")") + 1).trim();
                        st.push(in2);
                    }
                }
                System.out.println("**************** STACK *****************");
                Iterator val = st.iterator();
                Stack<String> mst = new Stack<String>();
                while (val.hasNext()) {
                    mst.push(val.next().toString());
                    //System.out.println(val.next());
                }

                System.out.println("*************** ROUNDS *****************");
                val = st.iterator();
                int inter = 1;
                Operatorss obj = new Operatorss();
                Class<?> classObj = obj.getClass();
                while (val.hasNext()) {
                    String temp = st.pop();      // pluralize( ds.strings.capitalize( ds.trim (" abc   " ) ))
                    String mstTop = mst.pop();      // pluralize      ( capitalize  ( trim " abc   " ) )
                    String stTop = temp;
                    System.out.println("Round" + inter++);
                    System.out.println("stack top:" + temp);
                    String a[];
                    if (temp.contains("(")) {
                        a = temp.split("\\(");
                    } else {
                        a = temp.split(" ", 2);
                    }
                    System.out.println("Array a:");
                    for (int j = 0; j < a.length; j++) {
                        System.out.println(a[j]);
                    }
                    String temp0 = a[0].trim();
                    System.out.println("a[0]:  " + a[0]);
                    temp = temp.replace(a[0].trim(), "").trim();
                    //temp=temp.replace("(","").replace(")","");
                    if (temp.startsWith("(") && temp.endsWith(")")) {
                        temp = temp.substring(1, temp.length() - 1).trim();
                    }
                    System.out.println("temp:  " + temp);
            /*GFG obj = new GFG();
        Class<?> classObj = obj.getClass();
        // get method object for "printMessage" function by
        // name
        Method printMessage = classObj.getDeclaredMethod("printMessage", String.class);
        try {
            // invoke the function using this class obj
            // pass in the class object
            printMessage.invoke(obj, "hello");
        }
        catch (InvocationTargetException e)
        {
            System.out.println(e.getCause());
        }*/
                    String ds = "";
                    // temp0 = capitalize
                    Method pm = classObj.getDeclaredMethod(temp0, String.class);
                    try {
                        ds = pm.invoke(obj, temp).toString();
                        System.out.println(ds);
                        //ds = ds.replace("temp",temp);
                    } catch (InvocationTargetException e) {
                        System.out.println(e.getCause());
                    }
                    if (val.hasNext()) {
                        String temp1 = st.pop();
                        //mst.pop();
                        System.out.println("temp1:" + temp1);
                        System.out.println("stTop:" + stTop);
                        System.out.println("mstTop:" + mstTop);
                        temp1 = temp1.replace(mstTop, ds);
                        System.out.println("temp1:" + temp1);
                        st.push(temp1);
                    } else {
                        System.out.println("*************FINAL SCRIPT***************");
                        System.out.println(ds);
                        map.replace(strkey, ds);
                        System.out.print("****************************************\n\n");
                    }
                }


            }//--foreach mop close

        }
        //----map print----
        me = null;
        //----map print close----
        List<String> keys = new ArrayList<String>(map.keySet());
        Collections.reverse(keys);
        String mm ="";
        int i = 0;
        for (String m : keys) {
            mm = mm + m + ":" + map.get(m)+",\n";
            System.out.println("*"+mm.trim());
        }
        body1 = body1.replace(body1, mm.trim());

       // System.out.println("val2=="+map.get("Val1"));
        return body1;
    }
}