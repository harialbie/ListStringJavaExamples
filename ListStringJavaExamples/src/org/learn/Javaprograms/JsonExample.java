package org.learn.Javaprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class JsonExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
         JSONObject json=new JSONObject();
         json.put("Name", "Rajni");
         json.put("Color", "White");
         
         JSONArray jsonArray=new JSONArray();
         jsonArray.add("Smile");
         jsonArray.add("Sentiment");
         
         json.put("Qualities", jsonArray);
         jsonArray=null;
         
         FileWriter fileWriter=new FileWriter("Sample.json");
         BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
         
         bufferedWriter.write(json.toJSONString());
         bufferedWriter.close();
         fileWriter.close();
         
         JSONParser jsonParser=new JSONParser();
         FileReader fileReader=new FileReader("Sample.json");
         BufferedReader bufferedReader=new BufferedReader(fileReader);
         Object parsedObject=jsonParser.parse(bufferedReader);
         
         JSONObject jsonObject=(JSONObject) parsedObject;
         String name=(String) jsonObject.get("Name");
         JSONArray jsonArray1= (JSONArray) jsonObject.get("Qualities");
         Iterator ite=jsonArray1.iterator();
         System.out.println(name);
         while (ite.hasNext()) {
			System.out.println(ite.next());
			
		}
	}

}
