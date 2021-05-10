package com.n11.pages;

import com.n11.utilities.BrowserUtils;
import org.junit.Assert;

public class PerfumePage extends BasePage {

   String searchPageData="";
   String favoritePageData="";



    public void searchProduct(){
        BrowserUtils.waitFor(5);
        markalar.click();
        BrowserUtils.waitFor(3);
        perfumeProduct.click();

    }
    public void addFavorite(){
        BrowserUtils.waitFor(4);
        clickHeart.click();
        BrowserUtils.waitFor(1);
        addFavorite.click();
        BrowserUtils.waitFor(2);
        confirmBtnFvt.click();

    }
    public void selectProduct(){
        seventhProd.click();
        BrowserUtils.waitFor(3);
        searchPageData=productTitle.getText();

    }
    public void navigateToFavorite(){
       favoritePage.click();
       BrowserUtils.waitFor(3);
       goFavoritePage.click();
       BrowserUtils.waitFor(3);
       favoritePageData=favoriteProTitle.getText();
    }
    public void verifyTitle(){
        Assert.assertEquals(searchPageData,favoritePageData);
    }

}
