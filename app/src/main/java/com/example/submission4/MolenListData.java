package com.example.submission4;

import java.util.ArrayList;

public class MolenListData {

    private static String[] molenNames = {
            "Strowberry",
            "Coklat",
            "Pisang",
            "Nanas",
            "Keju",
            "Jamu Sehat",
            "Paket Hemat",
            "Paket ExtraPuas",
            "Paket Komplit",
            "Spesial Edition"
    };

    private static String[] molenPrice = {
        "Rp 500/biji",
        "Rp 500/biji",
        "Rp 500/biji",
        "Rp 500/biji",
        "Rp 700/biji",
        "Rp 50.000/250G",
        "Rp 5.000/Paket",
        "Rp 15.000/Paket",
        "Rp 60.000/packet",
        "Rp 20.000/packet"
    };

    private static String[] molenDetail = {
            "Komposisi : Tepung Terigu, Gula, Garam, Mentega, Vanili, Air, Telur, Selai Strawberry\n Molen dengan olahan yang berbeda dari biasanya yaitu dengan isian selai Strawberry yang membuat sensasi rasa berbeda",
            "Komposisi : Tepung Terigu, Gula, Garam, Mentega, Vanili, Air, Telur, Selai Coklat Original\n" +
                    "Molen dengan isian coklat, yang memberi rasa berbeda saat anda menikmatinya",
            "Komposisi : Tepung Terigu, Gula, Garam, Mentega, Vanili, Air, Telur, Isi Pisang\n" +
                    "Molen yang sudah melekat dengan nama molen itu sendiri, isian yang pertama kali memperkenalkan apa itu  molen ,",
            "Komposisi : Tepung Terigu, Gula, Garam, Mentega, Vanili, Air, Telur, Isi Nanas\n" +
                    "Selain dapat di olah menjadi buah dasar makanan, nanas1 juga bisa diolah untuk di jadikan bahan dalam pembuatan molen, molen nanas1 membuat sensasi berbeda dalam pembuatan molen ",
            "Komposisi : Tepung Terigu, Gula, Garam, Mentega, Vanili, Air, Telur, Isi Keju\n" +
                    "Molen yang kini menjadi khas kota kembang 'Bandung' namun dikenal hampir di seluruh Indonesia, , terdapat  Keju  di dalamnya sehingga menambah gurih rasanya",
            "Komposisi : Bersumber dari Ramuan Herbal Alami dari Alam yang di oleh secara Modern dan Higenis\n" +
                    "Kami menyediakan 4  Macam Jamu untuk anda pilih, Ada Jahe, Jahe Merah, Kencur dan Kunyit, silahkan Anda pilih sesuai kebutuhan untuk memenuhi hidup sehat anda.",
            "Packet Hemat yang kami sediakan cocok untuk anda yang ingin santai menikmati molen di pagi atau sore hari.. wkhehe",
            "Paket Extra Puas, berisi lebih banyak dan topping yang lebih tebal cocok untuk dimakan bersama  dengan keluarga,, wkwk",
            "Paket yang semua produk kami anda dapatkan, molen dan Jamu tradisional anda dapatkan",
            "Paket Jumbo, kami berikan porsi extra besar, jika anda merasa tidak puas dengan molen mini yang kami sediakan.. heheh, selamat membeli..",

    };

    private static int[] molenImage = {
            R.drawable.strowberry1,
            R.drawable.coklat,
            R.drawable.pisang1,
            R.drawable.nanas1,
            R.drawable.keju1,
            R.drawable.jamu_sehat1,
            R.drawable.paket_hemat1,
            R.drawable.extra_puas1,
            R.drawable.komplit1,
            R.drawable.spesial1
    };

    static ArrayList<molen> getListData(){
        ArrayList<molen> list = new  ArrayList<> ();
        for (int position = 0; position < molenNames.length; position++){
            molen Molen = new molen();
            Molen.setName(molenNames[position]);
            Molen.setDetail(molenDetail[position]);
            Molen.setPrice(molenPrice[position]);
            Molen.setPhoto(molenImage[position]);
            list.add(Molen);
        }
        return list;
    }




}
