package com.n11.pages;


import com.n11.utilities.Driver;

public class FooterPage extends BasePage{
    String actualTitle="";

 public void footerList(){
     //List<WebElement> list1=Driver.get().findElements((By);
     //System.out.println("list1.get(2) = " + list1.get(2));


     for (int i = 0; i < liste.size(); i++) {

         if(liste.get(i).getText().equalsIgnoreCase("Markalar")){
             liste.get(i).click();
            actualTitle=Driver.get().getTitle();
            // once driver gets the actual title, loop will be broken by break statement
            break;

         }
     }

 }
 public String getActualTitle(){
     return actualTitle;

 }


}
