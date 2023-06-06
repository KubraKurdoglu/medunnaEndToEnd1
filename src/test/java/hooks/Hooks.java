package hooks;

import io.cucumber.java.Before;

import static base_urls.MedunnaBaseUrl.setUp;

public class Hooks {


    //Hooks olusturduk cunku, Cucumber da @Before methodu Hooks adli class'ta calistirilir
    //APi lerden once calsimasini istedigimiz seyler icin, Hoooks icinde olusturulur
    @Before("@api")//bu @api kismini ekleyerek sadece @api anatosyaonlari tasiyan testler oncesi calismasini sagladik
    public void beforeApi(){
        setUp();//bunu calistirinca spec numm kalmayacak
    }


}
