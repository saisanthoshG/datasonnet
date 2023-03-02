package com.datasonnet;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;
import com.datasonnet.Operatorss.*;
import com.datasonnet.document.DefaultDocument;
import com.datasonnet.document.MediaTypes;
import fansi.Str;

public class Multiple {
    //method call for key value pair with :
//    public static String tempo(String strkey, String str) throws NoSuchMethodException {
//
//
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put(strkey, str);
//        Stack<String> st = new Stack<String>();
//        st.push(str);
//        String in1;
//        int i = 0;
//        while (st.peek().contains("(")) { //( to check nested functionalities
//            in1 = st.peek();   //  ( trim " abc   " )
//            i++;
//            System.out.println(in1);
//            if (in1.startsWith("(") && in1.endsWith(")")) {
//                st.pop();
//                in1 = in1.substring(1, in1.length() - 1).trim();          // trim " abc   "
//                st.push(in1);
//            }
//            if (in1.contains("(") && in1.contains(")")) {
//                String in2 = in1.substring(in1.indexOf("("), in1.lastIndexOf(")") + 1).trim();
//                st.push(in2);
//            }
//        }
//        System.out.println("**************** STACK *****************");
//        Iterator val = st.iterator();
//        Stack<String> mst = new Stack<String>();
//        while (val.hasNext()) {
//            mst.push(val.next().toString());
//            //System.out.println(val.next());
//        }
//
//        System.out.println("*************** ROUNDS *****************");
//        val = st.iterator();
//        int inter = 1;
//        Operatorss obj = new Operatorss();
//        Class<?> classObj = obj.getClass();
//        while (val.hasNext()) {
//            String temp = st.pop();      // pluralize( ds.strings.capitalize( ds.trim (" abc   " ) ))
//            String mstTop = mst.pop();      // pluralize      ( capitalize  ( trim " abc   " ) )
//            String stTop = temp;
//            System.out.println("Round" + inter++);
//            System.out.println("stack top:" + temp);
//            String a[];
//            if (temp.contains("(")) {
//                a = temp.split("\\(");
//            } else {
//                a = temp.split(" ", 2);
//            }
//            System.out.println("Array a:");
//            for (int j = 0; j < a.length; j++) {
//                System.out.println(a[j]);
//            }
//            String temp0 = a[0].trim();
//            System.out.println("a[0]:  " + a[0]);
//            temp = temp.replace(a[0].trim(), "").trim();
//            //temp=temp.replace("(","").replace(")","");
//            if (temp.startsWith("(") && temp.endsWith(")")) {
//                temp = temp.substring(1, temp.length() - 1).trim();
//            }
//            System.out.println("temp:  " + temp);
//            /*GFG obj = new GFG();
//        Class<?> classObj = obj.getClass();
//        // get method object for "printMessage" function by
//        // name
//        Method printMessage = classObj.getDeclaredMethod("printMessage", String.class);
//        try {
//            // invoke the function using this class obj
//            // pass in the class object
//            printMessage.invoke(obj, "hello");
//        }
//        catch (InvocationTargetException e)
//        {
//            System.out.println(e.getCause());
//        }*/
//            String ds = "";
//            // temp0 = capitalize
//            Method pm = classObj.getDeclaredMethod(temp0, String.class);
//            try {
//                ds = pm.invoke(obj, temp).toString();
//                System.out.println(ds);
//                //ds = ds.replace("temp",temp);
//            } catch (InvocationTargetException e) {
//                System.out.println(e.getCause());
//            } catch (IllegalAccessException e) {
//                throw new RuntimeException(e);
//            }
//            if (val.hasNext()) {
//                String temp1 = st.pop();
//                //mst.pop();
//                System.out.println("temp1:" + temp1);
//                System.out.println("stTop:" + stTop);
//                System.out.println("mstTop:" + mstTop);
//                temp1 = temp1.replace(mstTop, ds);
//                System.out.println("temp1:" + temp1);
//                st.push(temp1);
//            } else {
//                System.out.println("*************FINAL SCRIPT***************");
//                System.out.println(ds);
//                map.replace(strkey, ds);
//                System.out.print("****************************************\n\n");
//            }
//        }
//        //----map print----
//        //me = null;
//        //----map print close----
//        List<String> keys = new ArrayList<String>(map.keySet());
//        Collections.reverse(keys);
//        String mm = "";
//        //int i = 0;
//        for (String m : keys) {
//            mm = mm + m + ":" + map.get(m) + ",\n";
//            System.out.println("*" + mm.trim());
//        }
//        return mm;
//    }
    public static String ReduceEq(String temp) throws NoSuchMethodException {
        String red[] = new String[999];
        red = temp.split("reduce");

        String val = "";
        String ds="";
        Operatorss obj = new Operatorss();
        Class<?> classObj = obj.getClass();
        if(red[1].contains("($$ + $)")) {
            Method pm = classObj.getDeclaredMethod("RedDs1", String.class);
            try {
                ds = pm.invoke(obj, red[0]).toString();
                System.out.println(ds);
                return ds;
                //ds = ds.replace("temp",temp);
            } catch (InvocationTargetException | IllegalAccessException e) {
                System.out.println(e.getCause());
            }
//            Mapper redmap = new Mapper(OrderBy.ReduceDs1(red[0], redop));
//            String transformedJson144 = (String) redmap.transform(new DefaultDocument<>(Cam, MediaTypes.APPLICATION_JSON)).getContent();
//            System.out.println(transformedJson144);
            return null;
        }
        else {
            System.out.println(red[1]);
            red[1] = red[1].replaceAll("[()]", "");
            System.out.println(red[1]);
            String red1[] = new String[999];
            if (red[1].contains("->"))
                red1 = red[1].split("->");
            System.out.println(red1[0]);
            String red11[] = new String[999];
            if (red1[0].contains(","))
                red11 = red1[0].split(",");
            System.out.println(red11[1]);
            String red112[] = new String[999];
            if (red11[1].contains("="))
                red112 = red11[1].split("=");
            System.out.println(red112[1]);
            // int val = 0;
            red[1] = red[1].trim();

            //System.out.println(red[0]);
//                int r1, r2, r11;
//                String rs = "";
//                String ss = "";
//                char ccc = 'q';
//                String re[] = new String[999];
//                if (red[0].startsWith("[") && red[0].endsWith("]")) {
//                    r2 = red[0].indexOf("[");
//                    //r2=red[0].indexOf("]");
//                    r1 = red[0].indexOf(",");
//                    //r11=r2+1
//                    rs = red[0].substring(r2 + 1, r1 + 12);
//                    //   ss= String.valueOf('s');
//                    ss = "gg";
//                    val = 0;
//                    //ccc='l';
//                }
//                String sccc = "\"" + ccc + "\"";
//                System.out.println(ccc);
////            for (String s:re
////            ) {
////                System.out.println(s);
////            }
            Method pm = classObj.getDeclaredMethod("ReduceDs", String.class, String.class);
            try {
                ds = pm.invoke(obj, red[0],red11[1]).toString();
                System.out.println(ds);
                return ds;
                //ds = ds.replace("temp",temp);
            } catch (InvocationTargetException e) {
                System.out.println(e.getCause());
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }

            return null;
//            Mapper redmap = new Mapper(OrderBy.ReduceDs(red[0], red112[1], redop));
//            String transformedJson144 = (String) redmap.transform(new DefaultDocument<>(Cam, MediaTypes.APPLICATION_JSON)).getContent();
//            System.out.println(transformedJson144);
        }

    }
    public static String ParseDWCode(String script) {
        String header = "";
        String body = "";
        String[] x;
        x = script.split("---");
        header = x[0];
        try {
            body = bodyParse(x[1].trim());
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.println("HEADER:\n" + header + "BODY:\n" + body);
        return null;
    }

    public static void main(String args[]) throws Exception {
        //\"CeilVal\": ds.strings.capitalize(ds.trim(\" abc   \"))\n"
        //script for capitalize---working
        String scriptcc = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "  \"Val1\": pluralize      ( capitalize  ( trim \" abc   \" ) ),\n\n\n\n" +
                "  \"Val2\": pluralize  ( capitalize  ( trim \" abc   \"  ) )\n" +
                "}";
        String scriptd = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "  \"Val1\":  ceil  ( min [1,2,3,4] ) ,\n\n\n\n" +
                "  \"Val2\": ceil  ( min  [1,2,3,4] )\n" +
                "}";
        String scriptMain = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "    \"Val1\": ceil  ( max [1,2,3,4] ),\n\n\n\n" +
                "  \"Val2\": ceil  ( min  [1,2,3,4] )\n" +
                "}";
        //Script for flatten----working
        String script111 = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "    \"Val1\": flatten [1,2,3,4]\n\n\n\n" +
                "}";
        //script for upper---working
        String scriptu="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "  name: upper \"mulesoft\"\n" +
                "}";
        //script for camelize--working
        String scriptc="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "    \"Val1\": camelize(\"customer_first_name\"),\n\n\n\n" +
                "  \"Val2\": camelize(\"_name_starts_with_underscore\")\n" +
                "}";
        //script for sizeOf---working
        String scriptso = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "  arraySize: sizeOf [1,2,3],\n" +
                "  textSize: sizeOf \"MuleSoft\",\n" +
                "  objectSize: sizeOf {a:1,b:2}\n" +
                "}";
        //script for typeof----need to check for this payload accessing via calling transform method once by passing payload as parameter
        String scriptto = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "isString: typeOf payload.mystring";

        //script for array push--integration not working check again
        String scripta ="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "aa: [0, 1, 2] + 5";
        //script for avg---workinh
        String scriptavg ="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "  a: avg [1,2,3,4]\n" +
                "}";
        //script for joinBy---working
        String scriptjb ="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "aa: [\"a\",\"b\",\"c\"] joinBy \"-\"";
        //script for splitBy---working
        String scriptsb ="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "split: \"a-b-c\" splitBy \"-\"";
        //script for orderBy (def ascending)---working
        String scriptoba ="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "orderByLetter: [{ letter: \"d\" }, { letter: \"e\" }, { letter: \"c\" }, { letter: \"a\" }, { letter: \"b\" }] orderBy $.letter";
        //script for orderBy ( descending)---not working check again
        String scriptdo ="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "orderDescending: ([3,8,1] orderBy $)[-1 to 0]";
       //script for remove fromm array--------working
        String scriptra ="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "  a: [0, 1, 1, 2] - 1" +
                "}";
        //script for removematch from array------------- working
        String scriptrm ="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "a: [0, 1, 1, 2] -- [1,2]";
        //script for Reduce---Integration problem
        String script_checkagain ="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "concat: [\"a\", \"b\", \"c\", \"d\"] reduce ($$ ++ $)";
        //script for distinctBy is working-------------
        String scriptdb ="%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "authors: payload.author distinctBy $\n" ;
        //script for typeof---working
        String script_to = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "isString: typeOf payload.mystring";
        //script for find----std.findSubstr----working
        String script_find = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                " b: \"aabccdbce\" find \"a\"";
        //script for substring-----working
        String script = "%dw 1.0\n" +
                "%output application/json\n" +
                "---\n" +
                "{\n" +
                "  \"a\": \"abcdefg\"[0..4],\n" +
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

            System.out.println(mop.length);

            int fl = 0;
            for (String body : mop
            ) {
                //System.out.println(body.trim());
                // System.out.println(s.trim().indexOf(':'));
                //--------------------------------------------
                if (body.contains(":")) {
                    body = body.trim();
                    int x = body.indexOf(':');
                    int len = body.length();
                    String strkey = body.substring(0, x).trim();
                    String str = body.substring(x + 1, len).trim();
                    //String strtr = tempo(strkey,str);
                    System.out.println(str + "----");
                    //body1=body1.replace(body1,strtr);

                    map.put(strkey, str);
                    Stack<String> st = new Stack<String>();
                    st.push(str);
                    String in1;
                    String first[];
                    int i = 0;
                    Operatorss obj = new Operatorss();
                    Class<?> classObj = obj.getClass();
                    while (st.peek().contains("(")) { //( to check nested functionalities
                        //check for the case like camelize("hello world") where first ( itself takes input
                        

                        in1 = st.peek();   //  ( trim " abc   " )
                        i++;
                        System.out.println(in1);
                        if (in1.startsWith("(") && in1.endsWith(")")) {
                            st.pop();
                            in1 = in1.substring(1, in1.length() - 1).trim();          // trim " abc   "
                            st.push(in1);
                        }
                        if (in1.contains("(") && in1.contains(")")) {// logic for operators accepting input payload within ( and ) without space for example check camelize("sai santhosh")
                            first = st.peek().split("\\(");
                            System.out.println(first[0]+"->"+first[1]);
                            //-----
                            if(first[1].startsWith("\"") && (first[1].endsWith("\"") || first[1].endsWith(")"))) {
                                String ds = "";
                               // String dummy = st.peek();
                                first[1] = first[1].replace("\\(","");
                                first[1] = first[1].replace(")","");
                                //dummy = dummy.replace(first[0],"");
                                // temp0 = capitalize
                                Method pm = classObj.getDeclaredMethod(first[0], String.class);
                                try {
                                    if (first[1].startsWith("(") && first[1].endsWith(")")) {
                                        first[1] = first[1].substring(1, first[1].length() - 1).trim();          // trim " abc   "
                                    }
                                    ds = pm.invoke(obj, first[1]).toString();
                                    System.out.println(ds);
                                    //ds = ds.replace("temp",temp);
                                } catch (InvocationTargetException e) {
                                    System.out.println(e.getCause());
                                }
                                break;
                            }
                           else {
                                //-------
                                String in2 = in1.substring(in1.indexOf("("), in1.lastIndexOf(")") + 1).trim();
                                st.push(in2);
                            }
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

                    while (val.hasNext()) {
                        String temp = st.pop();      // pluralize( ds.strings.capitalize( ds.trim (" abc   " ) ))
                        String mstTop = mst.pop();      // pluralize      ( capitalize  ( trim " abc   " ) )
                        String stTop = temp;
                        System.out.println("Round" + inter++);
                        System.out.println("stack top:" + temp);
                        String a[] = new String[999];
                        
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
                            if (temp.startsWith("(") && temp.endsWith(")")) {
                                temp = temp.substring(1, temp.length() - 1).trim();          // trim " abc   "
                            }
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
                } else {
                    if (body.startsWith("(") && body.endsWith(")")) {
                        int len = body.length();
                        body = body.substring(body.indexOf("(") + 1, len - 1);
                    }
                    String s[], tempbody;
                    if (body.contains("\\(")) {
                        tempbody = body;
                        //s = body.split("\\(");
                        int len = body.length();
                        //String strkey = body.substring(0, x).trim();
                        //String str = body.substring(x + 1, len).trim();
                        //System.out.println(str + "----" + str);
                        //map.put(strkey, str);
                        Stack<String> st = new Stack<String>();
                        st.push(body);
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
                                // map.replace(strkey, ds);
                                System.out.print("****************************************\n\n");
                            }
                        }
                    }


                }

            }//--foreach mop close

//        }else if(body1.contains(":"))
//        {
//            int x = body1.indexOf(':');
//            int len = body1.length();
//           // String strkey = body1.substring(0, x).trim();
//            String str = body1.substring(x + 1, len).trim();
//            if (str.startsWith("(") && str.endsWith(")")) {
//                str = str.substring(1, str.length() - 1).trim();          // trim " abc   "
//            }
//            String str1[];
//            if(str.contains("(") && str.contains(")"))
//            {
//                str1=str.split("\\(");
//            }
//        }
            //----map print----
            me = null;
            //----map print close----
            List<String> keys = new ArrayList<String>(map.keySet());
            Collections.reverse(keys);
            String mm = "";
            //int i = 0;
            for (String m : keys) {
                mm = mm + m + ":" + map.get(m) + ",\n";
                System.out.println("*" + mm.trim());
            }
            body1 = body1.replace(body1, mm.trim());
            //char ds;
            //dumbody=dumbody.replace(dumbody,ds);
            //System.out.println("val2==" + map.get("Val1"));
            //return body1;
            return body1;

        }//end of first if block where multiple key value pair nested operators case
        if (body1.contains(":")) { //case with single key value pair nested operators case
            int x = body1.indexOf(':');
            int len = body1.length();
            String strkey = body1.substring(0, x).trim();
            String str = body1.substring(x + 1, len).trim();
            System.out.println(str + "----" + str);
            map.put(strkey, str);
            Stack<String> st = new Stack<String>();
            st.push(str);
            String in1;
            int i = 0;
            Operatorss obj = new Operatorss();
            Class<?> classObj = obj.getClass();
//            if(st.peek().contains("+"))
//            {// for integrating arr push here not working check again
//                String body11=body1;
//                String ds="";
//                String apush[];
//                apush = st.peek().split("\\+");
//                Method pm = classObj.getDeclaredMethod("ArrPUSH", String.class);
//                try {
//                    ds = pm.invoke(obj, apush[0],apush[1]).toString();
//                    System.out.println(ds);
//                    //ds = ds.replace("temp",temp);
//                } catch (InvocationTargetException e) {
//                    System.out.println(e.getCause());
//                }
//                System.out.println("*************FINAL SCRIPT***************");
//                System.out.println(ds);
//                map.replace(strkey, ds);
//                System.out.print("****************************************\n\n");
//
//                List<String> keys = new ArrayList<String>(map.keySet());
//                Collections.reverse(keys);
//                String mm = "";
//                //int i = 0;
//                for (String m : keys) {
//                    mm = mm + m + ":" + map.get(m) + ",\n";
//                    System.out.println("*" + mm.trim());
//                }
//                body11 = body11.replace(body1, mm.trim());
//                //char ds;
//                //dumbody=dumbody.replace(dumbody,ds);
//                //System.out.println("val2==" + map.get("Val1"));
//                //return body1;
//                return body11;
//            }
//            //for avg operator check working
//            Iterator va = st.iterator();
//            while(va.hasNext())
//            {
//                if(st.peek().contains("avg"))
//                {
//                    String ds="";
//                    String a[]=new String[999];
//                    a=st.peek().split(" ");
//                    Method pm = classObj.getDeclaredMethod(a[0], String.class);
//                try {
//                    ds = pm.invoke(obj, a[1]).toString();
//                    System.out.println(ds);
//                    map.replace(strkey,ds);
//                    //System.out.println("*************FINAL SCRIPT***************");
//                    //ds = ds.replace("temp",temp);
//                } catch (InvocationTargetException e) {
//                    System.out.println(e.getCause());
//                }
//                    //----map print----
//                    me = null;
//                    //----map print close----
//                    List<String> keys = new ArrayList<String>(map.keySet());
//                    Collections.reverse(keys);
//                    String mm = "";
//                    //int i = 0;
//                    for (String m : keys) {
//                        mm = mm + m + ":" + map.get(m) + ",\n";
//                        System.out.println("*" + mm.trim());
//                    }
//                    body1 = body1.replace(body1, mm.trim());
//                    //char ds;
//                    //dumbody=dumbody.replace(dumbody,ds);
//                    //System.out.println("val2==" + map.get("Val1"));
//                    //return body1;
//                    return body1;
//                }
//            }
            //eol--for avg operator check working
            while (st.peek().contains("(")) { //( to check nested functionalities
                if(st.contains("reduce"))
                    break;
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

            while (val.hasNext()) {
                String temp = st.pop();      // pluralize( ds.strings.capitalize( ds.trim (" abc   " ) ))
                String mstTop = mst.pop();      // pluralize      ( capitalize  ( trim " abc   " ) )
                String stTop = temp;
                System.out.println("Round" + inter++);
                System.out.println("stack top:" + temp);
                String a[];
                if (temp.contains("(")) {
                     a = temp.split("\\(");
                    break;
                }
//                else if(temp.contains("+")) {
//                    a = temp.split("\\+");
//                    Method pm = classObj.getDeclaredMethod("append", String.class);
//                    String ds = "";
//                    try {
//                        ds = pm.invoke(obj, a[0], a[1]).toString();
//                        System.out.println(ds);
//                        //ds = ds.replace("temp",temp);
//                    } catch (InvocationTargetException e) {
//                        System.out.println(e.getCause());
//                    }
//                    if (val.hasNext()) {
////                        String temp1 = st.pop();
////                        //mst.pop();
////                        System.out.println("temp1:" + temp1);
////                        System.out.println("stTop:" + stTop);
////                        System.out.println("mstTop:" + mstTop);
////                        temp1 = temp1.replace(mstTop, ds);
////                        System.out.println("temp1:" + temp1);
////                        st.push(temp1);
//
//                        System.out.println("*************FINAL SCRIPT***************");
//                        System.out.println(ds);
//                        map.replace(strkey, ds);
//                        System.out.print("****************************************\n\n");
////                    } else {
////                        System.out.println("*************FINAL SCRIPT***************");
////                        System.out.println(ds);
////                        map.replace(strkey, ds);
////                        System.out.print("****************************************\n\n");
////                    }
//                    }
//                    //----map print----
//                    me = null;
//                    //----map print close----
//                    List<String> keys = new ArrayList<String>(map.keySet());
//                    Collections.reverse(keys);
//                    String mm = "";
//                    //int i = 0;
//                    for (String m : keys) {
//                        mm = mm + m + ":" + map.get(m) + ",\n";
//                        System.out.println("*" + mm.trim());
//                    }
//                    body1 = body1.replace(body1, mm.trim());
//                    //char ds;
//                    //dumbody=dumbody.replace(dumbody,ds);
//                    //System.out.println("val2==" + map.get("Val1"));
//                    //return body1;
//                    return body1;
//                    break;
//                }'
                //joinBy---  this operator is working case here
                if(temp.contains("joinBy"))
                {//logic for joinBy if abve content in temp string contains joinBy
                    a= temp.split("joinBy");
                    System.out.println("Array a:");
                    for (int j = 0; j < a.length; j++) {
                        System.out.println(a[j]);
                    }
                    String temp0 = a[0].trim();
                    System.out.println(a[1]);
//                    a[1]=a[1].replaceAll("\""," ");
//                    a[1]=""+a[1]+"";
//                    System.out.println(a[1]);
                    System.out.println("a[0]:  " + a[0]);
                    String ds = "";
                    Method pm = classObj.getDeclaredMethod("joinby", String.class, String.class);
                    try {
                        ds = pm.invoke(obj, a[0],a[1]).toString();
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
                    break;
                }
                //splitBy---this operator is working case here
                if(temp.contains("splitBy"))
                {
                    //logic for splitBy if abve content in temp string contains splitBy
                    a= temp.split("splitBy");
                    System.out.println("Array a:");
                    for (int j = 0; j < a.length; j++) {
                        System.out.println(a[j]);
                    }
                    String temp0 = a[0].trim();
                    System.out.println(a[1]);
//                    a[1]=a[1].replaceAll("\""," ");
//                    a[1]=""+a[1]+"";
//                    System.out.println(a[1]);
                    System.out.println("a[0]:  " + a[0]);
                    String ds = "";
                    Method pm = classObj.getDeclaredMethod("splitBy", String.class, String.class);
                    try {
                        ds = pm.invoke(obj, a[0],a[1]).toString();
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
                    break;
                }
                ///orderBy---this operator is working case here--descending ---need to check, this method call not working
//                if(temp.contains("orderBy") && temp.contains("[-1 to 0]"))
//                {
//                    temp=temp.replace("[-1 to 0]","");
//                    //logic for orderBy if abve content in temp string contains orderBy
//                    a= temp.split("orderBy");
//                    System.out.println("Array a:");
//                    for (int j = 0; j < a.length; j++) {
//                        System.out.println(a[j]);
//                    }
//                    String ss1=null;
//                    String temp0 = a[0].trim();
//                    System.out.println(a[1]);
////            if(a[1].contains("$")) {
////                int i2 = a[1].indexOf("\\.");
////                int len2 = a[1].length();
////                ss1 = a[1].substring(i2 + 1, len2);
////            }
//                    a[1]=a[1].replace("$.","").trim();
//
////                    String b[] = new String[999];
////                    if(a[1].contains("\\."))
////                        b=a[1].split("\\.");
////                    System.out.println("b[0]:  " + b[0]);
////                    System.out.println("b[1]:  " + b[1]);
//
//
////                    a[1]=a[1].replaceAll("\""," ");
////                    a[1]=""+a[1]+"";
////                    System.out.println(a[1]);
//                    System.out.println("a[1]:  " + a[1]);
//                    String ds = "";
//                    Method pm = classObj.getDeclaredMethod("des_order", String.class);
//                    try {
//                        ds = pm.invoke(obj, a[0]).toString();
//                        System.out.println(ds);
//                        //ds = ds.replace("temp",temp);
//                    } catch (InvocationTargetException e) {
//                        System.out.println(e.getCause());
//                    }
//                    if (val.hasNext()) {
//                        String temp1 = st.pop();
//                        //mst.pop();
//                        System.out.println("temp1:" + temp1);
//                        System.out.println("stTop:" + stTop);
//                        System.out.println("mstTop:" + mstTop);
//                        temp1 = temp1.replace(mstTop, ds);
//                        System.out.println("temp1:" + temp1);
//                        st.push(temp1);
//                    } else {
//                        System.out.println("*************FINAL SCRIPT***************");
//                        System.out.println(ds);
//                        map.replace(strkey, ds);
//                        System.out.print("****************************************\n\n");
//                    }
//                    break;
//                }
                //orderBy---this operator is working case here--def ascending
                if(temp.contains("orderBy"))
                {
                    //logic for orderBy if abve content in temp string contains orderBy
                    a= temp.split("orderBy");
                    System.out.println("Array a:");
                    for (int j = 0; j < a.length; j++) {
                        System.out.println(a[j]);
                    }
                    String ss1=null;
                    String temp0 = a[0].trim();
                    System.out.println(a[1]);
//            if(a[1].contains("$")) {
//                int i2 = a[1].indexOf("\\.");
//                int len2 = a[1].length();
//                ss1 = a[1].substring(i2 + 1, len2);
//            }
                        a[1]=a[1].replace("$.","").trim();

//                    String b[] = new String[999];
//                    if(a[1].contains("\\."))
//                        b=a[1].split("\\.");
//                    System.out.println("b[0]:  " + b[0]);
//                    System.out.println("b[1]:  " + b[1]);


//                    a[1]=a[1].replaceAll("\""," ");
//                    a[1]=""+a[1]+"";
//                    System.out.println(a[1]);
                    System.out.println("a[1]:  " + a[1]);
                    String ds = "";
                    Method pm = classObj.getDeclaredMethod("order", String.class, String.class);
                    try {
                        ds = pm.invoke(obj, a[0],a[1]).toString();
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
                    break;
                }
                // remove match from an array case: working
                if(temp.contains("--")){
                    a = temp.split("--");
                    String ds = "ds.removeMatch("+a[0]+","+a[1]+")";
                    System.out.println(ds);
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
                    break;
                }
                //remove from an array case:working
                if(temp.contains("-")) {
                    a = temp.split("-");
                    String ds = "ds.remove("+a[0]+","+a[1]+")";
                    System.out.println(ds);
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
                    break;


                }
                //reduce--->
                // reduce case need to check for integration
//                if(temp.contains("reduce")){
//                    String ds = ReduceEq(temp);
//                    if (val.hasNext()) {
//                        String temp1 = st.pop();
//                        //mst.pop();
//                        System.out.println("temp1:" + temp1);
//                        System.out.println("stTop:" + stTop);
//                        System.out.println("mstTop:" + mstTop);
//                        temp1 = temp1.replace(mstTop, ds);
//                        System.out.println("temp1:" + temp1);
//                        st.push(temp1);
//                    } else {
//                        System.out.println("*************FINAL SCRIPT***************");
//                        System.out.println(ds);
//                        map.replace(strkey, ds);
//                        System.out.print("****************************************\n\n");
//                    }
//                    break;
//                }
                //distinctBy is working---------------
                if(temp.contains("distinctBy")){
                    a = temp.split("distinctBy");
                    String ds = "ds.distinctBy("+a[0]+",function(item,index) item)";
                    System.out.println(ds);
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
                    break;
                }
                //substring---------workingg
                if(temp.contains("[") && temp.contains("]") && temp.contains("\""))
                {
                    int i1 = temp.indexOf("\"");
                    int i2 = temp.lastIndexOf("\"");
                    String str1 = temp.substring(i1+1,i2);
                    int i3 = temp.indexOf("[");
                    int i4=  temp.lastIndexOf("]");
                    String str2 = temp.substring(i3+1,i4);
                    str2 = str2.replace("..",",");

                    String ds = ""+str1+".substring("+str2+")";

                    System.out.println(ds);
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
                    break;
                }
                

                //find---working
                if(temp.contains("find")){
                    a = temp.split("find");
                    String ds = "std.findSubstr("+a[1]+","+a[0]+")";
                    System.out.println(ds);
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
                    break;
                }
                else {
                    a = temp.split(" ", 2);
                }
                System.out.println("Array a:");
                for (int j = 0; j < a.length; j++) {
                    System.out.println(a[j]);
                }
                String temp0 = a[0].trim();
                System.out.println("a[0]:  " + a[0]);
//                if(temp.contains("+"))
//                {
//                    Method pm = classObj.getDeclaredMethod("append", String.class);
////                    temp = temp.replace(a[0].trim(), "").trim();
////                    //temp=temp.replace("(","").replace(")","");
////                    if (temp.startsWith("(") && temp.endsWith(")")) {
////                        temp = temp.substring(1, temp.length() - 1).trim();
////                    }
//                }
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
            //----map print----
            me = null;
            //----map print close----
            List<String> keys = new ArrayList<String>(map.keySet());
            Collections.reverse(keys);
            String mm = "";
            //int i = 0;
            for (String m : keys) {
                mm = mm + m + ":" + map.get(m) + ",\n";
                System.out.println("*" + mm.trim());
            }
            body1 = body1.replace(body1, mm.trim());
            //char ds;
            //dumbody=dumbody.replace(dumbody,ds);
            //System.out.println("val2==" + map.get("Val1"));
            //return body1;
            return body1;
        }//end of second case with single key value pair nested operator
         else { //case without any key with nested operators
            //int x = body1.indexOf(':');
            int len = body1.length();
            String dumbody = body1;
            String ds = "";
            // String strkey = body1.substring(0, x).trim();
            // String str = body1.substring(x + 1, len).trim();
//        System.out.println(str + "----" + str);
//        map.put(strkey, str);
            Stack<String> st = new Stack<String>();
            st.push(body1);
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
                    //map.replace(strkey, ds);
                    System.out.print("****************************************\n\n");
                }


            }

            //----map print----
            me = null;
            //----map print close----
            //final case replacement with ds only===================
//            List<String> keys = new ArrayList<String>(map.keySet());
//            Collections.reverse(keys);
//            String mm = "";
//            //int i = 0;
//            for (String m : keys) {
//                mm = mm + m + ":" + map.get(m) + ",\n";
//                System.out.println("*" + mm.trim());
//            }
//            //body1 = body1.replace(body1, mm.trim());
//            //char ds;
            dumbody=dumbody.replace(dumbody,ds);
            //System.out.println("val2==" + map.get("Val1"));
            //return body1;
            return dumbody;
        }
//        //----map print----
//        me = null;
//        //----map print close----
//        List<String> keys = new ArrayList<String>(map.keySet());
//        Collections.reverse(keys);
//        String mm = "";
//        //int i = 0;
//        for (String m : keys) {
//            mm = mm + m + ":" + map.get(m) + ",\n";
//            System.out.println("*" + mm.trim());
//        }
//        body1 = body1.replace(body1, mm.trim());
//        //char ds;
//        //dumbody=dumbody.replace(dumbody,ds);
//        //System.out.println("val2==" + map.get("Val1"));
//        //return body1;
//        return body1;
    }
}