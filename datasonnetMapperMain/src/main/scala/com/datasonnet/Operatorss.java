package com.datasonnet;

import ujson.Arr;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Operatorss {
        public static String orderByD$(String payload, String opr, String field) {
        /* Sample DW code
        [{ letter: "e" }, { letter: "d" }] orderBy ($.letter)
        orderDescending: ([3,8,1] orderBy -$)
        */
        //System.out.println("This is orderBy$ method");
        String[] f, x;
        String DS_OrderBy;

        if (field.contains("->")) {  // orderBy (data) -> data.age


            f = field.split("->");
            // Subject to change if person.age is a function returning a single value like person.age
            x = f[1].split("\\.");



            DS_OrderBy = "{\n" +
                    "  language: std.sort(" + payload + ","
                    + "keyF=function(x) x." + x[1] + ")\n" +
                    "}";


        } else {        // orderBy doesn't consists of ->


            if (field.contains(".")) {      //handle ()

                if (field.contains("-")) {  // order for -$.data
                    field = field.replace("-", "");
                    x = field.split("\\.");
                    DS_OrderBy = "{\n" +
                            "  language: ds.util.reverse(std.sort(" + payload + " ,"
                            + "keyF=function(x) x." + x[1] + "))\n" +
                            "}";
                } else {  // order for $.data
                    x = field.split("\\.");
                    DS_OrderBy = "{\n" +
                            "  language: std.sort(" + payload + " ,"
                            + "keyF=function(x) x." + x[1] + ")\n" +
                            "}";
                }

            } else { //order by $

                System.out.println("Entering null");
                x = null;
                //x[0]=field;
                if (field.contains("-")) {
                    DS_OrderBy = "{\n" +
                            "  language: ds.util.reverse(std.sort(" + payload + "))\n" +
                            "}";
                } else {
                    DS_OrderBy = "{\n" +
                            "  language: std.sort(" + payload + ")\n" +
                            "}";
                }
            }
        }

        String Script = DS_Script(DS_OrderBy);
        System.out.println( Script );
        return Script;

    }       //Main

        public static String ceil(String n){
//            String ds="{\n" +
//                    "  \"CeilVal\": std.ceil("+n+")\n" +
//                    "}";
//            String Script = DS_Script(ds);
//            System.out.println( Script );
            //return Script;

            String script = "std.ceil("+n+")";
            return  script;

        }

        public static String sqrt(Double n){
            String ds="{\n" +
                    "  \"SqrtVal\": std.sqrt("+n+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }

        public static String floor(Double n){
            String ds="{\n" +
                    "  \"FloorVal\": std.floor("+n+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }

        public static String abs(Double n){
            String ds="{\n" +
                    "  \"AbsVal\": std.abs("+n+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }

        public static String mod(Double n1, Double n2){
            String ds="{\n" +
                    "\"ModVal\": ds.math.round(ds.math.mod(n1,n2),2)\n" +        //DS.Scala line 1332
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }

        public static String round(Double n){
            String ds="{\n" +
                    "\"RoundVal\": ds.math.round("+n+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }

        public static String pow(Double n, Double e){
            String ds="{\n" +
                    "\"PowVal\": ds.math.pow("+n+","+e+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }

        public static String now(){
        String ds="{\n" +
                "\"NowVal\": DS.ZonedDateTime.now()\n" +
                "}";
        String Script = DS_Script(ds);
        System.out.println( Script );
        return Script;

    }

        public static String min(Integer a[]){
//            String ds="{\n" +
//                    "\"MinVal\": ds.min("+a+")\n" +
//                    "}";
//            String Script = DS_Script(ds);
//            System.out.println( Script );
//            return Script;
            String Script = "ds.min("+a+")";
            return Script;

        }
        public static String min(String a){
            System.out.println(a);
//            String ds="{\n" +
//                    "\"MinVal\": ds.min("+s+")\n" +
//                    "}";
//            String Script = DS_Script(ds);
//            System.out.println( Script );
//            return Script;
            String Script = "ds.min("+a+")";
            return Script;

        }   // String overloaded min

        public static String max(Integer a[]){
            String ds="{\n" +
                    "\"MaxVal\": ds.max("+a+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }
        public static String max(String s){
//            String ds="{\n" +
//                    "\"MaxVal\": ds.max("+s+")\n" +
//                    "}";
//            String Script = DS_Script(ds);
//            System.out.println( Script );
//            return Script;
            String ds = "ds.max("+s+")";
            return ds;

        }   // String overloaded max

        public static String ordinalize(Integer n){
            String ds="{\n" +
                    "\"OrdVal\": ds.strings.ordinalize("+n+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }

        public static String singularize(String str){
            String ds="{\n" +
                    "\"SinVal\": ds.strings.singularize("+str+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }

        public static String pluralize(String str){
//            String ds="{\n" +
//                    "\"PluVal\": ds.strings.pluralize("+str+")\n" +
//                    "}";
//            String Script = DS_Script(ds);
//            System.out.println( Script );
//            return Script;
            String ds="ds.strings.pluralize("+str+")\n";
            return ds;

        }

        public static String camelize(String str){
//            String ds="{\n" +
//                    "\"CamVal\": ds.strings.camelize("+str+")\n" +
//                    "}";
//            String Script = DS_Script(ds);
//            System.out.println( Script );
//            return Script;

            String ds ="ds.strings.camelize("+str+")\n";
            return ds;
        }

        public String capitalize(String str){
            /*String ds="{\n" +
                    "\"CamVal\": ds.strings.capitalize("+str+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;*/
            String ds="ds.strings.capitalize("+str+")\n";
            return ds;

        }

        public String trim(String str){
            /*String ds="{\n" +
                    "\"TrimVal\": ds.trim("+str+")\n" +
                    "}";*/
            String ds="ds.trim("+str+")\n";
            /*String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;*/
            return ds;
        }

        public static String match(String str, String regex){
            //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
            String ds="{\n" +
                    "\"MatchVal\": ds.match("+str+","+regex+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }

        public static String scan(String str, String regex){
            //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
            String ds="{\n" +
                    "\"MatchVal\": ds.scan("+str+","+regex+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }
    public static String sizeOf(String str){
        //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
//        String ds="{\n" +
//                "\"MatchVal\": ds.scan("+str+","+regex+")\n" +
//                "}";
//        String Script = DS_Script(ds);
//        System.out.println( Script );
//        return Script;
        String ds = "std.length("+str+")";
        return ds;

    }
    public static String avg(String str){
        //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
//        String ds="{\n" +
//                "\"MatchVal\": ds.scan("+str+","+regex+")\n" +
//                "}";
//        String Script = DS_Script(ds);
//        System.out.println( Script );
//        return Script;
        String ds = "ds.math.avg("+str+")";
        return ds;

    }
    public static String RedDs1(String mPayload1){
//        String DwScan ="%dw 1.0\n" +
//                "%output application/json\n" +
//                "---\n" +
//                matopers;
//
//        String DsScan = "{\n" +
//                "  language: std.join(\"\","+mPayload1+")\n" +
//                "}";
//        String mapper1 = DwScan.replace("%dw 1.0", "/** DataSonnet\n" + "version=2.0\n").replace("%output application/json\n", "output application/json\n").replace("---", "*/").replace(matopers, DsScan);
//        System.out.println(mapper1);
//        return mapper1;
        String DsScan = "std.join(\"\","+mPayload1+")\n";
        return DsScan;
    }
    public static String ReduceDs(String mPayload1, String mpayload2){
//        String DwScan ="%dw 1.0\n" +
//                "%output application/json\n" +
//                "---\n" +
//                matopers;
//
//        String DsScan = "{\n" +
//                "  language: ds.foldLeft(" + mPayload1 + ","+mpayload2+", function(curr, prev) curr+prev)\n" +
//                "}";
//        String mapper1 = DwScan.replace("%dw 1.0", "/** DataSonnet\n" + "version=2.0\n").replace("%output application/json\n", "output application/json\n").replace("---", "*/").replace(matopers, DsScan);
//        System.out.println(mapper1);
//        return mapper1;

        String DsScan = "ds.foldLeft(" + mPayload1 + ","+mpayload2+", function(curr, prev) curr+prev)\n" ;

        return DsScan;
    }
//    public static String Arrpush(String payload, String eleappend, String DsOperation){
//        String DwSize = "%dw 2.0\n" +
//                "output application/json\n" +
//                "---\n" +
//                DsOperation;
//        String eleappend1 = '[' + eleappend + ']';
//        String DsSize = "{\n" +
//                "  language: "+payload+""+""+eleappend1+"\n" +
//                "}";
//        String mapper1 = DwSize.replace("%dw 2.0","/** DataSonnet\n"+ "version=2.0\n").replace("---","*/").replace(DsOperation,DsSize);
//        System.out.println(mapper1);
//        return mapper1;
//    }
    public static String append(String payload, String eleappend){
//        String DwSize = "%dw 2.0\n" +
//                "output application/json\n" +
//                "---\n" +
//                DsOperation;
        String eleappend1 = '[' + eleappend + ']';
        String DsSize = "{\n" +
                "  language: ds.append("+payload+","+eleappend+")" +
                "}";

        String Ds = "ds.append("+payload+","+eleappend+")";

        String DsSize11 = ""+payload+""+""+eleappend1+"\n";
       // String mapper1 = DwSize.replace("%dw 2.0","/** DataSonnet\n"+ "version=2.0\n").replace("---","*/").replace(DsOperation,DsSize);
        //System.out.println(mapper1);
        return Ds;
    }

    //joinBy working
    public static String joinby(String str,String sep){
        //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
//        String ds="{\n" +
//                "\"MatchVal\": ds.scan("+str+","+regex+")\n" +
//                "}";
//        String Script = DS_Script(ds);
//        System.out.println( Script );
//        return Script;
        //String sep =
        String ds = "ds.joinBy("+str+","+sep+")";
        return ds;

    }
    public static String typeOf(String str){
        //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
//        String ds="{\n" +
//                "\"MatchVal\": ds.scan("+str+","+regex+")\n" +
//                "}";
//        String Script = DS_Script(ds);
//        System.out.println( Script );
//        return Script;
        //String sep =
        String ds = "ds.typeOf("+str+")";
        return ds;

    }
    public static String splitBy(String str,String reg){
        //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
//        String ds="{\n" +
//                "\"MatchVal\": ds.scan("+str+","+regex+")\n" +
//                "}";
//        String Script = DS_Script(ds);
//        System.out.println( Script );
//        return Script;
        //String sep =
        String ds = "ds.splitBy("+str+","+reg+")";
        return ds;

    }


        /*public size(Array a){
            String s = typeOf(a);
        }

        public static String zip(Array arr1, Array arr2){
            //b: [0, 1, 2, 3] zip "a",  // Need to handle this case in Sample.java where, send "a" as ["a"]
            //[0, 1, 2, 3] zip ["a", "b", "c", "d"],
            int l = size(arr2);
            if(arr2.length==1){

            }
            String ds="{\n" +
                    "\"ZipVal\": ds.zip("+arr1+","+arr2+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }

        public static String zip(Array arr1, String str){
            //Convert any datatype to String
            //[0, 1, 2, 3] zip ["a", "b", "c", "d"],

            String ds="{\n" +
                    "\"ZipVal\": ds.zip([0, 1, 2, 3],[\"a\", \"b\", \"c\", \"d\"])\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }*/     //Zip

        /*public static String unzip(String str, String regex){
            //"\"ModVal\": dsmax.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
            String ds="{\n" +
                    "\"MatchVal\": ds.scan("+str+","+regex+")\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println( Script );
            return Script;

        }*/     //Unzip

    public static String flatten(String str){
        //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
//            String ds="{\n" +
//                    "\"splitVal\": ds.splitBy(str,regex)\n" +
//                    "}";
//            String Script = DS_Script(ds);
//            System.out.println(Script);
//            return Script;

        String ds = "ds.flatten("+str+")";
        return ds;

    }
    public static String upper(String payload){
//        String DwUpper = "%dw 2.0\n" +
//                "output application/json\n" +
//                "---\n" +
//                Upperoperation;
//        String DsUpper = "{\n" +
//                "  language: std.asciiUpper("+payload+")\n" +
//                "}";
//        String mapper1 = DwUpper.replace("%dw 2.0","/** DataSonnet\n"+ "version=2.0\n").replace("---","*/").replace(Upperoperation,DsUpper);
//        System.out.println(mapper1);
//        return mapper1;
        String DsUpper = " std.asciiUpper("+payload+")\n";
        return DsUpper;
    }
//        public static String splitBy(String str, String regex){
//            //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
////            String ds="{\n" +
////                    "\"splitVal\": ds.splitBy(str,regex)\n" +
////                    "}";
////            String Script = DS_Script(ds);
////            System.out.println(Script);
////            return Script;
//
//            String ds = "ds.splitBy(str,regex)";
//            return ds;
//
//        }

        public static String joinBy(Array arr, String regex){
            //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
            String ds="{\n" +
                    "\"joinVal\": ds.joinBy(arr,regex)\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println(Script);
            return Script;

        }

        public static String remove(Array arr, Integer pos){
            //aa: ["a", "b", "c"] - 1
            String ds="local x = "+ arr +";\n" +
                    "{\n" +
                    "    aa: ds.remove(x, x["+pos+"])\n" +
                    "}";
            String Script = DS_Script(ds);
            System.out.println(Script);
            return Script;
        }
    public static String order(String arr, String field1) {

        //aa: ["a", "b", "c"] - 1
        String ss = null;

        String ds = "ds.orderBy(" + arr + ",function(value) value." + field1+ " )";
        return ds;
    }
    public static String des_order(String arr) {

        //aa: ["a", "b", "c"] - 1
        String ss = null;

        String ds = "ds.reverse(ds.orderBy("+arr+",function(value) value))";
        return ds;
    }
        public static String DS_Script(String operation){
            String DWparseinput = "%dw 2.0\n" +
                    "output application/json\n" +
                    "---\n" +
                    "payload";
            String orderbymappers = DWparseinput.replace("%dw 2.0", "/** DataSonnet\n" + "version=2.0")
                    .replace("---", "*/").replace("payload", operation);
            return orderbymappers;
        }
        public static String Substring(String str1,String str2){
        //"\"ModVal\": ds.match(\"anniepoint@mulesoft.com\",\"([a-z]*)@([a-z]*).com\")\n"
//        String ds="{\n" +
//                "\"MatchVal\": ds.scan("+str+","+regex+")\n" +
//                "}";
//        String Script = DS_Script(ds);
//        System.out.println( Script );
//        return Script;
        //String sep =
        String ds = "ds.combine("+str1+","+str2+")";
        return ds;

    }
}

/*
System.out.println("--");
System.out.println(x[0]+"--"+x[1]);
*/
