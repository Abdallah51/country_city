///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package countryandcity;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//
///**
// *
// * @author 1
// */
//public class countrycitiesDao {
//    public ArrayList<cityinfo> getCities(){
//        Map<String, ArrayList<cityinfo>> Mapping = new HashMap<>(); 
//        ArrayList<countryinfo> countries = new ArrayList<>();
//        ArrayList<cityinfo> cities = new ArrayList<>();
//        String line = "";  
//        String splitBy = ","; 
//               
//        try   
//        {  
//            //parsing a CSV file into BufferedReader class constructor  
//
//            BufferedReader br = new BufferedReader(new FileReader("city.csv"));
//            BufferedReader cr = new BufferedReader(new FileReader("country.csv"));
//            String country_buffer;
//            
//            while ((country_buffer = cr.readLine()) != null) {
//                String[] dataOfCountry = country_buffer.split(",");
//                String nameOfCountry = dataOfCountry[0];
//                if (!"Country name".equals(nameOfCountry)) {
//                    countryinfo country_data = new countryinfo();
//                    country_data.setCountry(dataOfCountry[0]);
//                    country_data.setCode(dataOfCountry[1]);
//                    country_data.setCities(dataOfCountry[1]);
//                    countries.add(country_data);
//                    Mapping.put(dataOfCountry[1],new ArrayList<>());
//
//                }
//            }
//            
//            while ((line = br.readLine()) != null) {
//                
//                String[] city = line.split(splitBy);    // use comma as separator  
//                if(!"CityName".equals(city[0])){
//                    
//                    cityinfo city_data = new cityinfo();
//                    city_data.setName(city[0]);
//                    city_data.setCode((city[1]));
//                    String contint = city[2];
//                    city_data.setContinent(city[2]);
//                    city_data.setArea(Float.parseFloat(city[3]));
//                    city_data.setPopulation(Float.parseFloat(city[4]));  
//                    cities.add(city_data); 
//                    
//                    
//               }
//            for(int i =0;i<cities.size();i++){
//                List<cityinfo> mylist = Mapping.get(cities.get(i).getCode());
//                mylist.add(cities.get(i));
//                Mapping.put(cities.get(i).getCode(), (ArrayList<cityinfo>) mylist);
//            
//            }    
//                  
//            }
//
//        }   
//        catch (IOException e){      
//             e.printStackTrace();  
//        }finally{
//        return (ArrayList<cityinfo>) Mapping;
//    }
//    }
//}
//
//    
//
//
//
//
//
//
//
//
//
//
////            while ((country_buffer = cr.readLine()) != null) {
////                String[] dataOfCountry = country_buffer.split(",");
////                String nameOfCountry = dataOfCountry[0];
////                if (!"Country name".equals(nameOfCountry)) {
////                    String country_contint = dataOfCountry[3];
////                    ArrayList<cityinfo> total_list;
////                    if (Mapping.containsKey(countryCode)) {
////                        total_list = Mapping.get(countryCode);
////                    } else {
////                        total_list = new ArrayList<>();
////                    }
////                    countryinfo myCountry = new countryinfo(nameOfCountry, countryCode);
////                    countries.add(myCountry);
////                }
////            }