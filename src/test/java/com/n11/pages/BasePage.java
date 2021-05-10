package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "btnSignIn")
    public WebElement loginBtn;

   @FindBy(css="li[class='catMenuItem']")
   public List<WebElement> menuOptions;

    @FindBy(css = "[class='icon iconCosm']")
    public WebElement cosmeticBtn;

    @FindBy(css="li.mainCat>a[title='Parfüm & Deodorant']")
    public WebElement perfumeBtn;

    @FindBy(css="div.filter-list.less>div.filter-items.dropdown:nth-of-type(2)")
    public WebElement markalar;

    @FindBy(css = "label[for='m-Lacoste']")
    public WebElement perfumeProduct;

   // @FindBy(css="itemize-piece")
   // public List<WebElement> listofProduct;
    @FindBy(css="[data-position='7']")
    public WebElement seventhProd;

    @FindBy(css = "[class='addWishListBtn getWishList added']")
    public WebElement clickHeart;

    @FindBy(css="#addToFavouriteWishListBtn")
    public WebElement addFavorite;

    @FindBy(css="[class='pro-title_main ']")
    public WebElement productTitle;

    @FindBy(css="[class='btn btnBlack confirm']")
    public WebElement confirmBtnFvt;

    @FindBy(css="[class='icon iconFavorites']")
    public WebElement favoritePage;

    @FindBy(css="[class='icon-base heart-favorites-black']")
    public WebElement goFavoritePage;

    @FindBy(css="[itemprop='name']")
    public WebElement favoriteProTitle;

    @FindBy(id="footer")
    public WebElement footer;

    @FindBy(css="div[class=\"column \"]>div>ul>li")
    public List<WebElement> liste;









}
