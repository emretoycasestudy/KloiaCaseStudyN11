package com.n11.pages;

import com.n11.utilities.BrowserUtils;

public class NavigationPage extends BasePage{



    public void navigateCategory(){

        BrowserUtils.waitFor(10);
        cosmeticBtn.click();
        BrowserUtils.waitForClickablility(perfumeBtn,10);
        perfumeBtn.click();
    }

}

