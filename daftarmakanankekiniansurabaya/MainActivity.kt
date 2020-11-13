package com.example.daftarmakanankekiniansurabaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createFood()
        rv_food.layoutManager = LinearLayoutManager(this)
        rv_food.setHasFixedSize(true)
        rv_food.adapter = AdapterFood(testData, { itemFood : DataFood -> itemFoodClicked(itemFood) })
    }

    private fun itemFoodClicked(itemFood : DataFood) {
        val showDetailActivityIntent = Intent(this, DetailFood::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, itemFood.imageFud)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, itemFood.listHarga)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, itemFood.nameFud)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, itemFood.descFud)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, itemFood.addressFud)
        startActivity(showDetailActivityIntent)
    }

    private fun createFood() : List<DataFood> {
        val partList = ArrayList<DataFood>()
        partList.add(
            DataFood(
                R.drawable.seblakjeletotmpokadek,
                "Harga mulai Rp 6.000 - Rp 45.000",
                "Seblak Jeletot Surabaya",
                "\t\t Seblak adalah makanan Indonesia yang dikenal berasal dari Bandung. Kini, seblak bisa dijumpai dimana saja, apalagi Seblak Jeletot. Seblaknya para kaum milenia. Seblak Jeletot yang super pedas, menjadi sasaran kuliner yang digemari oleh kaum milenial.\n" +
                        "\t\t Jangan ngaku milineal kalau kalian belum coba seblak Jeletot Surabaya. Di Seblak Jeletot Mpok Adik, punya menu andalan yang harus banget kamu cobain saat ke sini, yakni seblak obster. Kombinasi kerupuk, bakso ikan, kwetiau, otak-otak, dan lobster bikin rasa seblak jadi makin lezat.\n" +
                        "\t Kamu bisa memilih tingkat kepedasan mulai dari, \n" +
                        "\t\t 1. level 0 \n" +
                        "\t\t 2. level 1 \n" +
                        "\t\t 3. level 2 \n" +
                        "\t\t 4. level 3 \n" +
                        "\t\t 5. level 4 \n" +
                        "\t\t 6. level 5 \n" +
                        "\t\t Harga satu porsinya Seblak Jeletot Mpok Adik yakni mulai dari Rp 6.000 hingga Rp 45.000. Harga tergantung level kepedasan, isi, dan juga topping. \n",
                "Alamat : \n" +
                        "Pujasera Alam Laut Food Garden Unit FG-02, Jln. Niaga Gapura Blok K No.10, Lidah Kulon, Lakarsantri, Lidah Kulon, Kec. Lakarsantri, Kota Surabaya Jawa Timur 60219 \n\n" +
                        "Jam Buka : \n" +
                        "Pk 12.00 - 10.00 PM \n\n" +
                        "Telepon : \n" +
                        "082233533099 \n\n\n"
            )
        )
        partList.add(
            DataFood(
                R.drawable.dalgona,
                "Harga dibawah Rp 50.000/orang",
                "Noona Dalgona Surabaya",
                "\t\t Dalgona coffee adalah minuman kekinian yang sedang trend saat ini, yang dibuat dengan mencampurkan kopi instan, gula, dan air panas dengan jumlah perbandingan yang sama. Campuran itu kemudian dikocok sehingga menjadi krim dan kemudian ditambahkan ke susu dingin atau panas." +
                        "Noona Dalgona meyediakan berbagai varian Dlgona Coffe mulai dari, \n" +
                        "\t 1. Dalgona Original \n" +
                        "\t\t - Dalgona Ori Cappuccino Premium. \n" +
                        "\t\t - Dalgona Ori Matcha Premium. \n" +
                        "\t\t - Dalgona Ori Chocolate Premium. \n" +
                        "\t\t - Dalgona Ori Red Velvet Premium. \n" +
                        "\t\t - Dalgona Ori Taro Premium. \n" +
                        "\t\t - Dalgona Ori Black Coffe Premium. \n" +
                        "\t 2. Dalgona Cokelat \n" +
                        "\t\t\t - Dalgona Chovel. \n" +
                        "\t\t\t - Dalgona Choco. \n" +
                        "\t\t\t - Dalgona Chocin. \n" +
                        "\t\t\t - Dalgona Chocha. \n" +
                        "\t\t\t - Dalgona Chotar. \n" +
                        "\t 3. Dalgona Boba Series. \n" +
                        "Untuk harga satu porsi minuman Dalgona yakni Rp 13.500 saja, cukup ramah kantong buat kalian para siswa dan mahasiswa yang mau minum dalgon tanpa merogo kocek terlalu mahal. Noona Dalgona juga menyediakan snack dan makanan jadi tarif yang perlu dikeluarkan makanan dan minuman Dalgona dibawah Rp 50.000/orang.  \n",
                "Alamat : \n" +
                        "Jln. Gn. Anyar Emas Selatan XI No.190, Gn. Anyar Tambak, Kec. Gn. Anyar, Kota SBY, Jawa Timur 60294 \n\n" +
                        "Jam Buka : \n" +
                        "Pk 10.00 - 12.00 AM \n\n" +
                        "Telepon : \n" +
                        "085745250160 \n\n\n"
            )
        )
        partList.add(
            DataFood(
                R.drawable.rotibakarspesialpuff,
                "Harga mulai dari Rp 16.000",
                "Roti Bakar Spesial Puff Surabaya",
                "\t\t\t Roti bakar menjadi salah satu menu jajanan pinggir jalan yang banyak diburu di malam hari terutama disekitar kota Surabaya. Makanan yang satu ini memiliki ciri khas dengan tekstur bagian luar yang renyah dan manisnya selai di bagian dalam.\n" +
                        "\t\t\t Roti Bakar Special Puff, pertama di Surabaya dengan KRISPI yang JUARA. Dengan menawarkan roti bakar yang berbeda dari biasanya, sensasi CRUNCHY dari isiannya benar-benar bikin penasaran. \n" +
                        "\t\t\t Menu yang ditawarkan beragam mulai dari,\n" +
                        "\t\t 1. RB Cream Cheese Chocolate \n" +
                        "\t\t 2. RB Milo Avocado \n" +
                        "\t\t 3. RB Greentea Oreo \n" +
                        "\t\t 4. RB Choco Crunchy \n" +
                        "\t\t 5. RB Mozarella \n" +
                        "dan lain-lain. Ada yang Roti Bakar rasa manis dan juga asin. Harga yang ditawarkan mulai dari Rp 16.000. Buat yang ingin tambah topping, bisa membayar Rp 5.000. \n",
                "Alamat : \n" +
                        "Jln. Pucang Anom Timur II No.62, Kertajaya, Kec. Gubeng, Kota SBY, Jawa Timur 60282 \n\n" +
                        "Jam Buka : \n" +
                        "Pk 02.00 - 09.00 PM \n\n" +
                        "Telepon : \n" +
                        "081358582794 \n\n\n"
            )
        )
        partList.add(
            DataFood(
                R.drawable.sendwichicecream,
                "Harga mulai Rp 17.000 - Rp 77.000",
                "Sandwich Ice Cream Surabaya",
                "\t\t\t Ice cream sandwich merupakan menu olahan es krim yang cukup populer di beberapa negara. Camilan menyegarkan ini umumnya disajikan dalam bentuk kepingan biskuit atau selebaran roti yang berisi ice cream di bagian tengahnya. Di Singapore Sandwich Ice Cream Surabaya menyediakan beberapa varian rasa dengan harga dibandrol mulai dari Rp 17.000 sampai Rp 77.000 (belum termasuk PPN). \n",
                "Alamat : \n" +
                        "Jln. Dharmahusada 37 Galaxy Mall Lt 3 Fc 28, Surabaya 60132 \n\n" +
                        "Jam Buka : \n" +
                        "Pk 10.00 AM - 10.00 PM \n\n\n" +
                        ""
            )
        )
        partList.add(
            DataFood(
                R.drawable.corndog,
                "Harga dibawah Rp 50.000/orang",
                "Oppa Corndog Surabaya",
                "\t\t\t CornDog adalah makanan yang terbuat dari sosis ditusuk yang dilapisi dengan lapisan tebal adonan encer tepung jagung kasar dan digoreng rendam. Corndong menjadi cemilan kekinian disegala penjuru wilayah, salah satunya Surabaya. Menu Corndog ini menjadi sasaran milenial, selain untuk dimakan, biasanya kaum milenial akan memotret leboh dahulu untuk diposting ke sosial media. Oppa Corndog Surabaya menyediakan berbagai macam menu Corndog dari 2 varian rasa yaitu Corndong Asin dan Corndog Manis. Harga Oppa Corndog Di bawah Rp 50.000/orang. \n",
                "Alamat : \n" +
                        "Jln. Dharmahusada No. 148, Gubeng, Surabaya \n\n" +
                        "Jam Buka : \n" +
                        "Pk 11.00 AM - 09.00 PM \n\n" +
                        "Telepon : \n" +
                        "087781685568 \n\n\n"
            )
        )
        partList.add(
            DataFood(
                R.drawable.fatstrawboba,
                "Harga mulai Rp 18.000 - Rp 45.000",
                "Boba Fat Straw Surabaya",
                "\t\t\t Boba adalah bola tapioka yang kerap menjadi isian minuman bubble tea. Boba berbahan dasar tepung tapioka yaitu tepung dari singkong. Tapioka sendiri tidak memiliki rasa, sehingga rasa manis dari Boba sebagian besar diambil dari gula atau maduyang direndam sebelum disajikan. \n" +
                        "\t\t\t Boba menjadi topping dari makanan dan minuman kekinian dimanapun salah satunya di kota Surabaya, Fat Straw Surabaya menyediakan berbagai menu dengan topping boba mulai dari minuman hingga dessert. Harga dibandrol mulai dari Rp 18.000 hingga Rp 45.000. \n",
                "Alamat : \n" +
                        "Ruko Puncak Bukit Golf Blok BT, Jln. Bukit Darmo Boulevard, Pradahkalikendal, Dukuhpakis, Surabaya City, East Java 60225 \n\n" +
                        "Jam Buka : \n" +
                        "Pk 10.00 AM - 10.00 PM \n\n" +
                        "Telepon : \n" +
                        "085109885333 \n\n\n"
            )
        )
        partList.add(
            DataFood(
                R.drawable.basoaciakang,
                "Harga dibawah Rp 50.000/orang",
                "Baso Aci Surabaya",
                "\t\t\t Bakso Aci atau yang biasa kita kenal dengan sebutan Baso Aci, adalah makanan khas dari Garut yang sampai saat ini masih digandrungi oleh banyak kalangan. Kuliner ini terbuat dari tepung kanji atau yang biasa orang sunda disebut kaji. Kini Baso Aci memiliki varian rasa kepedasan dengan tingkat level kepedasan.\n" +
                        "\t\t\t Semakin marak kuliner pedas, Baso Aci menjadi salah satu menu favorite di Surabaya. Kuliner khas Garut ini memiliki tekstur yang kenyal. Biasanya disajikan dengan beragam toping mulai dari ceker, tahu, hingga pilus. Cita rasa pedas bercampur asam menjadi ciri khas makanan ini.\n" +
                        "\t\t\t Di Surabaya, terdapat beberapa tempat makan yang menawarkan menu makanan ini. Di antaranya yaitu Baso Aci Akang. Untuk 2pcs baso aci dan ceker, misalnya dibandrol masing-masing Rp 2.500. Sementara cuanki kembung dan cuanki siomay dibandrol masing-masing Rp 1.000, dan lain sebagainya. \n" +
                        "\t\t\t Disediakan paket menu yang dibandrol mulai Rp 17.000 hingga Rp 22.000. Paket yang favorit yaitu Paket Karohal yang harganya Rp 20.000. Isinya yaitu baso aci, batagor mini crispy, batagor kering, cuankie tahu mini, cuankie kembung, cuankie siomay, dan tetelan sapi. \n",
                "Alamat : \n" +
                        "Jl. Manukan Lor Blk. 4N No.25, Manukan Kulon, Tandes, Surabaya, Jawa Timur 60185 \n\n" +
                        "Jam Buka : \n" +
                        "Pk 12.00 AM - 10.00 PM \n\n" +
                        "Telepon : \n" +
                        "082131811400 \n\n\n"
            )
        )
        partList.add(
            DataFood(
                R.drawable.potatosanlongfries,
                "Harga dibawah Rp 50.000/orang",
                "Potato-san Long Fries",
                "\t\t\t Menu baru olahan kentang yang kekinian, banyak digemari yakni Potato Long Fries. Potato Long Fries adalah olahan kentang yang digoreng, dipadu dengan keju cheddar, oregano, tepung maizena, dan sagu dalam adonannya.\n" +
                        "\t\t\t Jika kalian tertarik mencoba Potato Long Fries, langsung saja kunjungi outlite Potato-san Long Fries. Untuk harga satu porsi Potato Long Fries dibawah Rp 50.000/orang. Terdapat berbagai varian saus dan topping. \n",
                "Alamat : \n" +
                        "Jl. Jend. A. Yani No. 16 - 18, Wonokromo, Surabaya (Royal Plaza, Lantai 3) \n\n" +
                        "Jam Buka : \n" +
                        "Pk 10.00 AM - 10.00 PM \n\n" +
                        "Telepon : \n" +
                        "08815051027 \n\n\n"
            )
        )
        partList.add(
            DataFood(
                R.drawable.pns,
                "Harga mulai dari Rp 19.000",
                "Pisang Nuget Surabaya",
                "\t\t\t Pisang Nuget yang Fenomenal dari Pisang Nuget Surabaya (PNS). Siapa yang tak kenal dengan olahan pisang ini. Pisang Nuget merupakan salah satu kuliner yang akhir-akhir ini menjadi incaran masyarakat, mulai dari anak kecil hingga orang dewasa.\n" +
                        "\t\t\t Pisang nugget menjadi cemilan yang kekinian di kota Surabaya. Harga pisang nugget di PNS dibanderol mulai dari 19 ribu rupiah saja untuk satu topping. Toppingnya pun bermacam-macam mulai dari keju, mangga, tiramisu, stawberry hingga oreo. \n",
                "Alamat : \n" +
                        "Jln. Balongsari Tama Bar. IV, Balongsari, Kec. Tandes, Kota SBY, Jawa Timur 60186 \n\n" +
                        "Jam Buka : \n" +
                        "Pk 12.00 AM - 09.00 PM \n\n" +
                        "Telepon : \n" +
                        "08118998896 \n\n\n"
            )
        )
        partList.add(
            DataFood(
                R.drawable.kakayamgeprek,
                "Harga dibawah Rp 50.000/orang",
                "Ayam Geprek Surabaya",
                "\t\t\t Ragam menu berbasis olahan ayam seperti tidak ada habisnya. Bila kamu gemar menyantap hidangan ayam goreng sekaligus makanan serba pedas, ayam geprek tentunya bisa menjadi salah satu makanan favoritmu. Sajian ayam berbalut tepung yang digoreng hingga berwarna cokelat keemasan, kemudian sedikit diulek hingga agak hancur ini akan terasa makin nikmat saat disandingkan bersama sambal bawang. Tak hanya rasa gurih serta pedas yang menggigit, kombinasi tekstur renyah sekaligus empuk membuat hidangan ini juga begitu menggugah selera. \n" +
                        "\t\t\t Kakkk, Ayam Geprek merupakan salah satu tempat makan yang menyediakan olahan ayam geprek. Tersedia opsi ayam geprek bagian dada, paha atas, hingga sayap untuk kamu pilih. Selain sambal bawang gurih yang jadi khasnya, ada pula berbagai jenis sambal lainnya seperti sambal matah, sambal terasi, hingga sambal hijau dengan rasa pedas yang tidak kalah menggigit. \n" +
                        "\t\t\t Mau lebih lengkap? Padankan sepiring nasi ayam geprekmu dengan tahu, tempe, telur, terung, dan kol goreng. Buat kamu yang sudah tidak menyantap nasi putih, kamu bisa menggantinya dengan nasi merah. Menariknya lagi, Kakkk, Ayam Geprek juga menyajikan hidangan ayam geprek kekinian dengan keju mozzarella leleh di atasnya. Harga ayam geprek di bawah 50 ribu rupiah per porsi.\n",
                "Alamat : \n" +
                        "Jln. Dharmawangsa No.115, Kertajaya, Kec. Gubeng, Kota SBY, Jawa Timur 60282 \n\n" +
                        "Jam Buka : \n" +
                        "Pk 10.00 AM - 10.00 PM \n\n" +
                        "Telepon : \n" +
                        "085706868623 \n\n\n"
            )
        )
        partList.add(
            DataFood(
                R.drawable.tahujeletot,
                "Harga mulai dari Rp 2.000",
                "Tahu Jeletot Surabaya",
                "\t\t Segala masakan pedas kini menjadi incaran masyarakat di Surabaya. Salah satunya, olahan dari bahan dasar tahu yakni tahu pedas atau yang lebih dikenal tahu jeletot menjadi sasaran kuliner. \n" +
                        "\t\t\t Tahu Jeletot Taisi menawarkan beberapa menu varian tahu ektra pedas dengan isi seperti, \n" +
                        "\t\t 1. Original Taisi \n" +
                        "\t\t 2. Extra Spicy Taisi \n" +
                        "\t\t 3. Spicy Sausage Taisi \n" +
                        "\t\t 4. Spicy Chicken Taisi \n" +
                        "\t\t 5. Hot Mushroom Taisi \n" +
                        "\t\t 6. Spicy Macarel Taisi \n\n" +
                        "\t\t Tahu pedas ini dibanderol mulai Rp 2.000 hingga Rp 4.000 (harga bisa berubah, menyesuaikan harga jual dengan kebutuhan).\n",
                "Alamat : \n" +
                        "Jln. Pucang sewu No. 7 Kota Surabaya, Jawa Timur \n\n" +
                        "Jam Buka : \n" +
                        "Pk 08.00 AM - 05.00 PM \n\n\n" +
                        ""
            )
        )
        partList.add(
            DataFood(
                R.drawable.cekerpedas,
                "Harga dibawah Rp 30.000/orang",
                "Ceker Teroris Surabaya",
                "\t\t\t Segala masakan pedas kini menjadi incaran masyarakat di Surabaya. Salah satunya, olahan ceker pedas atau yang lebih dikenal ceker jeletot atau ceker mercon atau ceker teroris banyak digemari kaum milineal. Ceker diolah dengan bumbu khusus yang disebut radikal oleh pemiliknya karena bumbunya yan sangat pedas, menjadikan menu ceker teroris memiliki rasa pedas yang lumayan ekstrem di mulut. \n" +
                        "\t\t\t Ceker Teroris menawarkan dua rasa, yakni \n" +
                        "\t\t 1. Ceker Teroris bumbu Rica-Rica \n" +
                        "\t\t 2. Ceker Teroris bumbu Krengsengan. \n",
                "Alamat : \n" +
                        "Jln. Raya Kalirungkut Blk. AM No.3, Kali Rungkut, Kec. Rungkut, Kota SBY, Jawa Timur 60293 \n\n" +
                        "Jam Buka : \n" +
                        "Pk 11.00 AM - 09.00 PM \n\n" +
                        "Telepon : \n" +
                        "082131811400 \n\n\n"
            )
        )
        return partList
    }
}