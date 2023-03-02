package com.datasonnet;
import com.datasonnet.document.DefaultDocument;
import com.datasonnet.document.Document;
import com.datasonnet.document.MediaTypes;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.datasonnet.Operatorss;

public class Sample {

    public static void main(String[] args){
        try {
            simpleExample();
            //multipleParamaters();
        }
        catch(Exception e){
            System.out.println("Err: "+e);
        }
        //multipleParamaters();

    }

    private static void simpleExample() throws IOException {

        String variable = "";
        String value = "";

        //String datasonnetScript13 = "dw 2.0\n" +
        //        "version=2.0\n" +
          //      "*/" +
            //    "{\n" +
              //  "  \"abc\": std.asciiUpper('100 Cats!')\n" +
                //"}";

/*        String datasonnetScript1 = "{\n" +
                "  languages: ds.util.groupBy(payload.languages, 'language.name'),\n" +
                "}";

        String datasonnetScript12 = "{\n" +
                "  Val: ds.find(payload, 2),\n" +
                "}";*/ //DS find, groupBy

/*
String datasonnetScript11 = "{\n" +
"    hmacValue: DS.util.Contains(payload, 2)\n" +
"}";*/ //Contains not working

/*
        String datasonnetScript2 = "{\n" +
                "  language: std.sort([{name: \"Santiago\", age: 42},{name: \"Leandro\", age: 29}, {name: \"Mariano\", age: 35}] ,"
                + "keyF=function(x) x.age)\n" +
                "}";
*/

//DS scripts: country, currency with DS header
/*                "{\n" +
               "  language: DS.contains(json, 2)\n" +
                "}";
*/
        //String datasonnetScript="/** DataSonnet\n" +
          //      "version=1.0\n" +
            //    "*/" +
              //  "{\n" +
                //"  \"Country\": payload.country,\n" +
               // "  \"Currency\": payload.Currency,\n" +
                //"  \"Age\": payload.Age\n" +
                //"}";

/*        String datasonnetScript3="{\n" +
                "  \"Country\": payload.country,\n" +
                "  \"Currency\": payload.Currency\n" +
                "}";

        String datasonnetScript33="{\n" +
                "  \"ID\": payload.id,\n" +
                "  \"Name\": payload.name\n" +
                "}";

        String datasonnetScript="{\n" +
                "  \"nameId\": payload.name + \" - \" + payload.userId,\n" +
                "  \"numberPlusString\" : payload.number1 + payload.name,\n" +
                "  \"stringPlusNumber\" : payload.name + payload.number1,\n" +
                "  \"numberPlusNumber\" : payload.number1 + payload.number2,\n" +
                "  \"objects\" : payload.object1 + payload.object2,\n" +
                "  \"arrays\" : payload.array1 +\n" +
                "             payload.array2 +\n" +
                "             payload.array3\n" +
                "}";

        String json2xml = "payload";
*/  // DS scripts: country, currency, id, name without DS header

// /*Mapper mapper = new Mapper(datasonnetScript33);*/

/*        String DS_Script1="%dw 2.0\n" +
                "output application/json\n" +
                "input payload application/json\n" +
                "---\n" +
                "{\n" +
                "    \"id\": payload.id,\n" +
                "    \"name\": payload.name\n" +
                "}";*/  // J2J DS_Script: id,name with dw header




        Map<String, Document<?>> variables = Collections.singletonMap(variable, new DefaultDocument<>(value, MediaTypes.APPLICATION_JSON));

        // Ceil
        /*String operation = " abs -2.25 ";
        String pay="", fn="",field="";
        operation=operation.trim();
        System.out.println(operation);
        String opr = "abs";
        if(operation.contains(opr)) {
            int len = operation.length();
            int index = operation.indexOf(opr);
            pay = operation.substring(0, index);  // 0 to (index-1)
            fn = opr;
            field = operation.substring(index, len).replace(opr, "").trim();
        }

        String Script2Run = Operatorss.abs(Double.parseDouble(field));*/
        //String regex = "\"(\\d+)\"";

        /*  a: unzip [[0,"a"],[1,"b"],[2,"c"],[3,"d"]],
        b: unzip [ [0,"a"], [1,"a"], [2,"a"], [3,"a"]],
        c: unzip [ [0,"a"], [1,"a","foo"], [2], [3,"a"]]*/

        // [0, 1, 2, 3, 4, 5] filter $ > 2
        // ["john", "peter", "matt"] map ((firstName, position) -> position ++ ":" ++ upper firstName)

        /*String Script2Run = "{\n" +
                "\"a\": std.foldl(function(aggregate,x) aggregate+x, payload.root.order.items, {}),\n" +
                "\"ac\": payload.root.order\n" +
                "}";*/
//        String Script2Run = "{\n" +
//                "orderByLetter: ds.orderBy([{ letter: \"d\" }, { letter: \"e\" }, { letter: \"c\" }, { letter: \"a\" }, { letter: \"b\" }], function(value) value.letter)"+
//                "}";
        String Script2Run = "{\n" +
                "orderByLetter: std.findSubstr(\"a\", \"aabccdbce\")"+
                "}";



        System.out.println(Script2Run);
        Mapper mapper = new Mapper(Script2Run, variables.keySet());

        //Mapper mapper = new Mapper(orderbymapper, variables.keySet());

        String DS_Payload="<root>\n" +
                "    <order>\n" +
                "      <items>155</items>\n" +
                "    </order>\n" +
                "    <order>\n" +
                "      <items>30</items>\n" +
                "    </order>\n" +
                "    <order>\n" +
                "      <items>15</items>\n" +
                "    </order>\n" +
                "    <order>\n" +
                "      <items>5</items>\n" +
                "    </order>\n" +
                "    <order>\n" +
                "      <items>4</items>\n" +
                "      <items>7</items>\n" +
                "    </order>\n" +
                "    <order>\n" +
                "      <items>1</items>\n" +
                "      <items>3</items>\n" +
                "    </order>\n" +
                "    <order>\n" +
                "        null\n" +
                "    </order>\n" +
                "</root>";

/*        String payload ="{\n" +
                "    \"account_id\": \"654\",\n" +
                "    \"disabled\": false,\n" +
                "    \"email_address\": \"wexler@modusbox.com\",\n" +
                "    \"full_name\": \"Dave Wexler\",\n" +
                "    \"generic\": false,\n" +
                "    \"headline\": \"CEO\",\n" +
                "    \"id\": \"789\",\n" +
                "    \"photo\": \"n/a\",\n" +
                "    \"update_whitelist\": [\n" +
                "        \"full_name\",\n" +
                "        \"headline\",\n" +
                "        \"email_address\",\n" +
                "        \"external_reference\"\n" +
                "    ]\n" +
                "}";

        String payload12 = "[\n" +
                "  [\n" +
                "    1,\n" +
                "    2\n" +
                "  ],\n" +
                "  [\n" +
                "    3,\n" +
                "    4\n" +
                "  ]\n" +
                "]";

        String json2="{\n" +
                "    \"country\": \"Usa\",\n" +
                "    \"Currency\": \"local\",\n" +
                "    \"Age\": 23\n" +
                "}";
        String json1="[\n" +
                "  {\n" +
                "    \"name\": \"User1\",\n" +
                "    \"age\": 19\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"User2\",\n" +
                "    \"age\": 18\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"User3\",\n" +
                "    \"age\": 15\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"User4\",\n" +
                "    \"age\": 13\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"User5\",\n" +
                "    \"age\": 16\n" +
                "  }\n" +
                "]";

        String jsonx = "[\n" +
                "    2,\n" +
                "    3,\n" +
                "    5,\n" +
                "    7\n" +
                "]";

        String json12="{\n" +
                "    \"id\": \"123\",\n" +
                "    \"name\": \"Max the Mule\"\n" +
                "}";
        String json="{\n" +
                "  \"userId\" : \"123\",\n" +
                "  \"name\" : \"DataSonnet\",\n" +
                "  \"number1\" : 1,\n" +
                "  \"number2\" : 2,\n" +
                "  \"object1\" : {\n" +
                "    \"Hello\" : \"Hello\"\n" +
                "  },\n" +
                "  \"object2\" : {\n" +
                "    \"World\" : \"World\"\n" +
                "  },\n" +
                "  \"array1\": [1, 2],\n" +
                "  \"array2\": [3, 4],\n" +
                "  \"array3\": [2, 4]\n" +
                "}";
        String payload111 ="{\n" +
                "  \"languages\": [\n" +
                "    {\n" +
                "      \"language\": {\n" +
                "        \"name\": \"Java\",\n" +
                "        \"version\": \"1.8\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"language\": {\n" +
                "        \"name\": \"Scala\",\n" +
                "        \"version\": \"2.13.0\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"language\": {\n" +
                "        \"name\": \"Java\",\n" +
                "        \"version\": \"1.7\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"language\": {\n" +
                "        \"name\": \"Scala\",\n" +
                "        \"version\": \"2.11.12\"\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        String payload1 = "{\n" +
                "  \"languages\": \n" +
                "    {\n" +
                "      \"language1\": {\n" +
                "        \"name\": \"Java\",\n" +
                "        \"version\": \"1.8\"\n" +
                "      },\n" +
                "      \"language2\": {\n" +
                "        \"name\": \"Scala\",\n" +
                "        \"version\": \"2.13.0\"\n" +
                "      },\n" +
                "      \"language3\": {\n" +
                "        \"name\": \"Java\",\n" +
                "        \"version\": \"1.7\"\n" +
                "      },\n" +
                "      \"language4\": {\n" +
                "        \"name\": \"Scala\",\n" +
                "        \"version\": \"2.11.12\"\n" +
                "      }\n" +
                "    }\n" +
                "}";
        String payload11 = "{\n" +
                "  \"age\":\n" +
                "   {\n" +
                "     \"message\": \"Hello World\"\n" +
                " }\n" +
                "}";

 */ //example payloads

        String transformedJson12 = mapper.transform(new DefaultDocument<>(DS_Payload, MediaTypes.APPLICATION_XML)).getContent();
        System.out.println("*************");
        //String transformedJson = mapper.transform(new DefaultDocument<String>(payload1, MediaTypes.APPLICATION_JSON), variables, MediaTypes.APPLICATION_JSON).getContent();
        java.lang.System.out.println("Output:  "+transformedJson12);
    }

    /*private static void multipleParamaters() {

        String json = "{\n" +
                "  \"userId\": \"123\",\n" +
                "  \"userName\": \"abc\"\n" +
                "}";
        //String json="";
        String xmlVar = "";
        String textVar = "";
        String datasonnetScript="payload";
        String csv1="Name,Last Name\n" +
                "Mariano, De achaval\n" +
                "Leandro, Shokida";


        Map<String, Document> variables = new HashMap<>();
        //variables.put("varJson", new StringDocument(json, "application/json"));
        //variables.put("varXml", new StringDocument(xmlVar, "application/xml"));
        //variables.put("varTxt", new StringDocument(textVar, "text/plain"));

        Mapper mapper = new Mapper(datasonnetScript);
        Document transformedResult = mapper.transform(new StringDocument(csv1, "application/csv"), variables, "application/json");
        String jsonResult = transformedResult.getContentsAsString();
        java.lang.System.out.println("Output:  "+jsonResult);

        String datasonnetScript11 = "{\r\n"
                + "        address1: payload.order.buyer.address,\r\n"
                + "        city: payload.order.buyer.city,\r\n"
                + "        country: payload.order.buyer.nationality,\r\n"
                + "        email: payload.order.buyer.email,\r\n"
                + "        name: payload.order.buyer.name,\r\n"
                + "        postalCode: payload.order.buyer.postCode,\r\n"
                + "        stateOrProvince: payload.order.buyer.state\r\n"
                + "}";

        Mapper mapper1 = new Mapper(datasonnetScript11);
        String xml="<?xml version='1.0' encoding='UTF-8'?>\r\n"
                + "<order>\r\n"
                + "  <product>\r\n"
                + "    <price>5</price>\r\n"
                + "    <model>MuleSoft Connect 2016</model>\r\n"
                + "  </product>\r\n"
                + "  <item_amount>3</item_amount>\r\n"
                + "  <payment>\r\n"
                + "    <payment-type>credit-card</payment-type>\r\n"
                + "    <currency>USD</currency>\r\n"
                + "    <installments>1</installments>\r\n"
                + "  </payment>\r\n"
                + "  <buyer>\r\n"
                + "    <email>mike@hotmail.com</email>\r\n"
                + "    <name>Michael</name>\r\n"
                + "    <address>Koala Boulevard 314</address>\r\n"
                + "    <city>San Diego</city>\r\n"
                + "    <state>CA</state>\r\n"
                + "    <postCode>1345</postCode>\r\n"
                + "    <nationality>USA</nationality>\r\n"
                + "  </buyer>\r\n"
                + "  <shop>main branch</shop>\r\n"
                + "  <salesperson>Mathew Chow</salesperson>\r\n"
                + "</order>";

        Document transformedResult1 = mapper1.transform(new StringDocument(xml, "application/xml"), variables, "application/json");
        String jsonResult1 = transformedResult1.getContentsAsString();
        java.lang.System.out.println("Output:  "+jsonResult1);
    }*/     // Multiple parameters fn
}