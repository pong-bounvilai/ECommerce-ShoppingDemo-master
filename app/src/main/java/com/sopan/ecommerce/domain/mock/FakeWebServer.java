package com.sopan.ecommerce.domain.mock;

import com.sopan.ecommerce.model.CenterRepository;
import com.sopan.ecommerce.model.entities.Product;
import com.sopan.ecommerce.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
 * This class serve as fake server and provides dummy product and category with real Image Urls taken from flipkart
 */
public class FakeWebServer {

    private static FakeWebServer fakeServer;

    public static FakeWebServer getFakeWebServer() {

        if (null == fakeServer) {
            fakeServer = new FakeWebServer();
        }
        return fakeServer;
    }

    void initiateFakeServer() {

        addCategory();

    }

    public void addCategory() {

        ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

        listOfCategory
                .add(new ProductCategoryModel(
                        "Men Shirt",
                        "Shirts for men",
                        "10%",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRBQJWgtPXtMX3GhewgGCfkUpdGPhL1lJLNpb_Ertt8sP6UdcWO&usqp=CAU"));

        listOfCategory
                .add(new ProductCategoryModel(
                        "Women shirts",
                        "Shirts for women",
                        "15%",
                        "https://direct.asda.com/on/demandware.static/-/Library-Sites-ASDAShared/default/dw5c53d29f/George-assets/images/George_Womens_panel01_010520.jpg"));

        CenterRepository.getCenterRepository().setListOfCategory(listOfCategory);
    }

    public void getAllElectronics() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();
//
//        // Ovens
        productlist
                .add(new Product(
                        "HRX by Hrithik Roshan",
                        "Men Yellow Printed Round Neck T-Shirt",
                        "Keep this hip this season with the HRX Men's Athleisure T-shirt. This versatile T-shirt can be styled any way you like for the ultimate gym-to-street look.",
                        "5490",
                        "10",
                        "4290",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/1700944/2019/6/8/972c9498-3a37-4d5d-976c-4493b4d5c0021559989322793-HRX-by-Hrithik-Roshan-Men-Yellow-Printed-Round-Neck-T-Shirt--1.jpg",
                        "oven_1"));

        productlist
                .add(new Product(
                        "Roadster",
                        "Men Maroon & Navy Blue Striped Round Neck T-shirt",
                        "Maroon and navy blue striped T-shirt, has a round neck, long sleeves",
                        "5000",
                        "10",
                        "4290",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/1697714/2020/1/22/64dd85e1-5c22-4a15-8c38-d02026613aa01579690524262-Roadster-Men-Maroon--Navy-Blue-Striped-Round-Neck-T-shirt-93-3.jpg",
                        "oven_2"));

        productlist
                .add(new Product(
                        "Roadster",
                        "Men White Brush Printed Round Neck T-shirt",
                        "White printed T-shirt, has a round neck, short sleeves",
                        "5290",
                        "10",
                        "4290",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/1824369/2017/5/5/11493980166159-Roadster-Men-White-Printed-Round-Neck-T-shirt-4411493980165893-3.jpg",
                        "oven_3"));

        productlist
                .add(new Product(
                        "WROGN",
                        "Men Teal Green & White Slim Fit Striped Polo Collar T-shirt",
                        "Teal Green and White striped T-shirt, has a polo collar, and short sleeves",
                        "5300",
                        "12",
                        "4290",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/11363712/2020/2/24/b0c63355-6c41-4032-9678-481505ea4cf01582542302399-WROGN-Men-Tshirts-9941582542301300-3.jpg",
                        "oven_4"));

        productlist
                .add(new Product(
                        "Kook N Keech Marvel",
                        "Men Black Marvel Printed Round Neck T-shirt",
                        "Black printed T-shirt, has a round neck, short sleeves",
                        "5190",
                        "10",
                        "4290",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/8972451/2019/3/28/9b6514c7-486e-4151-bbde-62bceca62e111553772641530-Kook-N-Keech-Marvel-Men-Black-Marvel-Printed-Round-Neck-T-sh-1.jpg",
                        "oven_5"));

        productMap.put("Men", productlist);

        ArrayList<Product> tvList = new ArrayList<Product>();


        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllFurnitures() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "Athena",
                        "Women Red & Gold-Coloured Checked Ethnic Jacket",
                        "Women Red & Gold-Coloured Checked Ethnic Jacket",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/productimage/2019/10/3/ca25e005-a3d3-4f9a-919e-dea78fd89e481570101064888-1.jpg",
                        "almirah_1"));

        productlist
                .add(new Product(
                        "Athena",
                        "Women Blue Printed Tailored Jacket",
                        "Blue printed jacket, has a spread collar, long sleeves, curved hem, and polyester",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/productimage/2019/10/3/ccb384d4-824d-4694-b31b-375379e3f2321570097966637-1.jpg",
                        "almirah_2"));

        productlist
                .add(new Product(
                        "Ives",
                        "Women Olive Green Solid Shirt Style Top",
                        "Olive Green solid woven shirt style top with ruffles detail, has a mandarin collar, three-quarter sleeves, button closure",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/8375271/2019/1/7/582995a9-d9c8-4129-8538-bf6492edc0191546853353174-Ives-Women-Olive-Green-Solid-Shirt-Style-Top-342154685335233-1.jpg",
                        "almirah_3"));

        productlist
                .add(new Product(
                        "Roadster",
                        "Women Maroon Solid Round Neck T-shirt",
                        "Maroon solid T-shirt, has a round neck, short sleeves",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/2312468/2018/2/21/11519195992877-Roadster-Women-Maroon-Solid-Round-Neck-T-shirt-7951519195992737-3.jpg",
                        "almirah_4"));

        productlist
                .add(new Product(
                        "SASSAFRAS",
                        "Women Green Ruffled Shirt Style Top",
                        "Green solid woven shirt style top with ruffles, has a mandarin collar, long sleeves, button closure",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/1052250/2019/4/11/9dcb4437-fefb-47fa-b538-38f0cf8016111554985706159-SASSAFRAS-Women-Olive-Green-Regular-Fit-Solid-Casual-Shirt-3-5.jpg",
                        "almirah_5"));

        productlist
                .add(new Product(
                        "Harpa",
                        "Women Mustard Yellow Polka Dot Print Wrap Top",
                        "Mustard yellow and white printed woven wrap top with tie-up, has a V-neck, short sleeves",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/8986017/2019/3/14/09e033fa-9925-4f5f-b5aa-6aac32307fed1552553406848-Harpa-Women-Tops-4791552553405672-1.jpg",
                        "almirah_6"));

        productMap.put("Women", productlist);

        productMap.put("Women", productlist);

        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllProducts(int productCategory) {

        if (productCategory == 0) {

            getAllElectronics();
        } else {

            getAllFurnitures();

        }

    }

}
