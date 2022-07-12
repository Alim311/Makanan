package com.example.makanan311910583;

import java.util.ArrayList;
public class DataKuliner {

    public static String[][] data = new String[][]{
            {"Ketoprak", "Ketoprak adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprak dijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima.\n" +
                    "\n" +
                    "Bahan-bahan utamanya adalah tahu, bihun, mentimun, taoge, dan bisa juga memakai telur rebus yang dilengkapi dengan saus kacang, kecap manis, dan taburan bawang merah goreng. " +
                    "Dapat pula dihidangkan dengan tambahan kerupuk atau emping melinjo. Beberapa versi ada pula yang menyertakan tempe sebagai komponennya. Alat yang digunakan untuk mengolah ketoprak tidaklah sulit, yakni hanya butuh ulekan dan pisau.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Ketoprak_Boplo.JPG/800px-Ketoprak_Boplo.JPG"},
            {"Nasi Goreng", "adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.",
            "https://upload.wikimedia.org/wikipedia/commons/d/d8/Nasi_Goreng_Sosis.jpg"},
            {"Sate", "merupakan makanan berasal dari pulau Jawa, makanan ini biasanya dihidangkan dengan bumbu sambal kacang sebagai bahan utamanya dan dicampur dengan aneka jenis sayuran. Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Pecel_Hariadhi.JPG/1024px-Pecel_Hariadhi.JPG"},
            {"Sate", "adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Sate_Ponorogo.jpg/800px-Sate_Ponorogo.jpg"},
            {"Rawon", "adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur (daerah Arekan), dikenal pula oleh masyarakat Jawa Tengah sebelah timur (daerah Surakarta).",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Rawon_Setan.jpg/800px-Rawon_Setan.jpg"},
            {"Bakmi", "adalah salah satu jenis sajian mi yang dipopulerkan oleh pedagang-pedagang Tiongkok ke Indonesia. Bakmi juga sering disebut yamien atau yahun. Bakmi juga merupakan makanan yang terkenal terutama di daerah-daerah \"pecinan\" di Indonesia. Biasanya bakmi telah diadaptasi dengan menggunakan bumbu-bumbu Indonesia. Tebalnya bakmi adalah antara Mian Cina dan Udon Jepang, selain itu ada berbagai variasi bakmi di Indonesia.",
            "https://upload.wikimedia.org/wikipedia/commons/5/56/Mi_ayam_pangsit_kuah.JPG"}


    };

    public static ArrayList<ModelKuliner> ambilDataKuliner() {
        ArrayList<ModelKuliner> dataKuliner = new ArrayList<>();
        for (String[] varData : data) {
            ModelKuliner model = new ModelKuliner();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);
            dataKuliner.add(model);
        }
        return dataKuliner;
    }
}