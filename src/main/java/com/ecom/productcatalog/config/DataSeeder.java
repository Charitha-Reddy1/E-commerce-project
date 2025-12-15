package com.ecom.productcatalog.config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository ;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();
        //categories
        Category electronics=new Category();
        electronics.setName("Electronics");

        Category clothing=new Category();
        clothing.setName("Clothing");

        Category home=new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics,clothing,home));

        //Products
        Product phone=new Product();
        phone.setName("Smart Mobile");
        phone.setDescription("16GB,5000Mah");
        phone.setImageUrl("https://shareefcorner.sa/media/catalog/product/cache/bf85db037af22de949cb7e4b40520ffe/h/u/huawei_pura_80_ultra_4g_golden_black.png");
        phone.setPrice(40000.00);
        phone.setCategory(electronics);

        Product watch=new Product();
        watch.setName("Smart Watch");
        watch.setDescription("Health tracking");
        watch.setImageUrl("https://www.titan.co.in/dw/image/v2/BKDD_PRD/on/demandware.static/-/Sites-titan-master-catalog/default/dw61458d43/images/Titan/Catalog/90188AP01_1.jpg?sw=600&sh=600");
        watch.setPrice(1499.00);
        watch.setCategory(electronics);

        Product hp=new Product();
        hp.setName("Headphones");
        hp.setDescription("Music,videos and many more");
        hp.setImageUrl("https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcQoojI-bX2QkXoLyMIaFxGWYW02ZOHabjbiqSitOUbht_Za9_I_ICi1hdlH_gjqg8BEvZbFPyDCL3qHhjFcnVJd_SLlwJK_1bvaOBxJYnYcxqbbmpMLEUmhqw");
        hp.setPrice(3499.00);
        hp.setCategory(electronics);

        Product laptop=new Product();
        laptop.setName("Laptop");
        laptop.setDescription("Gaming Laptop,258GB,Intel Core i5");
        laptop.setImageUrl("https://www.computersmobile.com.au/wp-content/uploads/2017/08/toshibalaptop1-400x400.jpg");
        laptop.setPrice(50000.00);
        laptop.setCategory(electronics);

        Product tshirt=new Product();
        tshirt.setName("TShirt for casual wear");
        tshirt.setDescription("L Size");
        tshirt.setImageUrl("https://shop.globalcyclingnetwork.com/cdn/shop/files/13_400x.png?v=1706270477");
        tshirt.setPrice(400.00);
        tshirt.setCategory(clothing);

        Product ss=new Product();
        ss.setName("Sweat Shirt");
        ss.setDescription("Jujustu Kaisen Edition");
        ss.setImageUrl("https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcSuerYPfpLWCus8KYX40c4rw88W_6ShC145c9sLhxlChyT316XDLpn1o7q_E5tAbLHxd4lIUtWFUdUNpD2ybgBW5v3G8-4DBwc5gDtwAbwG3UrZ1IjcC3_9");
        ss.setPrice(1099.00);
        ss.setCategory(clothing);

        Product juicer=new Product();
        juicer.setName("Fruit juicer");
        juicer.setDescription("For all types of fruit juices");
        juicer.setImageUrl("https://bulletbrands.com.au/cdn/shop/files/Juicer2.0_400x.png?v=1759108048");
        juicer.setPrice(1200.00);
        juicer.setCategory(home);

        Product af=new Product();
        af.setName("Air fryer");
        af.setDescription("Oil-less expertise");
        af.setImageUrl("https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcRUYFxx-VF3I1aMOKwLQJqToHblUC8Dv1vMuMYHrZPvT653HF1ImAWsa7ReRTDAXMawZ2uuK_3J7qeT8czajKIOq91UUMFNfND_CvxQDT6SRTRzlODyUItB");
        af.setPrice(4899.00);
        af.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone,laptop,tshirt,juicer,watch,ss,hp,af));
    }
}
