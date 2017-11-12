package com.miftakhularzak.wonderfulindonesia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<WisataModel>listData;

    public static String[][] data3 = new String[][]{
            {"Raja Ampat Islands","West Papua", "The Raja Ampat Islands are an Indonesian archipelago off the northwest tip of Bird’s Head Peninsula in West Papua. Comprising hundreds of jungle-covered islands, Raja Ampat is known for its beaches and coral reefs rich with marine life. Ancient rock paintings and caves are on Misool Island, while the crimson bird of paradise lives on Waigeo Island. Batanta and Salawati are the archipelago’s other main islands.", "http://cdni.condenast.co.uk/1440x960/k_n/misool-eco-resort-raja-ampat-west-papua-indonesia-conde-nast-traveller-17aug15-Tobias-Zimmer_1440x960.jpg"},
            {"Borobudur Temple", "Magelang, Central Java","Borobudur, or Barabudur is a 9th-century Mahayana Buddhist temple in Magelang, Central Java, Indonesia, and the world's largest Buddhist temple. The temple consists of nine stacked platforms, six square and three circular, topped by a central dome.", "http://www.ancient-origins.net/sites/default/files/field/image/Buddhist-Temple-Borobudur.jpg"},
            {"Komodo Island","East Nusa Tenggara", "Komodo island, part of the Lesser Sunda chain of Indonesian islands, is the rugged habitat of the 3m-long Komodo dragon monitor lizard. Komodo National Park covers the entire region and is home to more than 4,000 dragons, and is made up of rusty-red volcanic hills, savannah and forests. Its surrounding waters of seagrass beds, mangrove shrublands and coral reefs are famous for diving.", "https://i.ytimg.com/vi/7ead5Ti7zNg/maxresdefault.jpg"},
            {"Bunaken Island","North Sulawesi", "Bunaken is an island of 8 km², part of the Bunaken National Marine Park. Bunaken is located at the northern tip of the island of Sulawesi, Indonesia. It belongs administratively to the municipality of Manado.", "http://4.bp.blogspot.com/-_y0GfiO6_B4/V2II4miFiTI/AAAAAAAAB3o/6-iPRC3g6Xcqh4j0H4CP5o77I8o82MfVwCK4B/s1600/20150810144619_keindahan%2Bterumbu%2Bkarang.jpg"},
            {"Mount Bromo","East Java", "Mount Bromo, is an active volcano and part of the Tengger massif, in East Java, Indonesia. At 2,329 metres it is not the highest peak of the massif, but is the most well known.", "http://bromoeastjava.com/wp-content/uploads/2016/06/Ijen-Volcano-Mt-Bromo-Waterfall-Tour-3-Days.jpg"},
            {"Mount Rinjani", "West Nusa Tenggara","Mount Rinjani or Gunung Rinjani is an active volcano in Indonesia on the island of Lombok. Administratively the mountain is in the Regency of North Lombok, West Nusa Tenggara.", "https://upload.wikimedia.org/wikipedia/commons/6/68/Segara_Anak.jpg"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv);
        listData = new ArrayList<>();
        for (int i=0; i<data3.length; i++){
            WisataModel data1 = new WisataModel();
//            data.setNama("Gajah");
//            data.setDeskripsi("deskripsinya");
            data1.setGambar(data3[i][3]);
            data1.setNama(data3[i][0]);
            data1.setLokasi(data3[i][1]);
            data1.setDeskripsi(data3[i][2]);
           // data1.setDeskripsi(data3[i][2]);
           // data.setGambar("http://cdn.klimg.com/dream.co.id/resources/news/2017/03/09/52356/664xauto-terjawab-mengapa-semut-selalu-cipika-cipiki-saat-berpapasan-170309g.jpg");
            listData.add(data1);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Wisata(this, listData));
    }


}
