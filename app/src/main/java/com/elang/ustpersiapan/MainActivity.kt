package com.elang.ustpersiapan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Daftar Kampus Jawa Tengah"

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.telkompwt,"Institut Teknologi Telkom Purwokerto (ITTP)","Purwokerto",
            "Institut Teknologi Telkom Purwokerto (ITTP) " +
                "merupakan kampus telkom yang didirikan pada tahun 2002 yang dikelola oleh Yayasan Pendidikan Telkom dan di bawah naungan PT Telkom Indonesia. " +
                "ITTP adalah salah satu perguruan tinggi swasta di Jawa Tengah yang memiliki fokus pada pengembangan ilmu pengetahuan yang berbasis pada teknologi informasi pada bidang Healthcare, Agro-Industry, Tourism, dan Small Medium Enterprise (HATS)."))

        data?.add(DataModel(R.drawable.poltektegal,"Politeknik Harapan Bersama","Tegal",
            "Poloteknik Harapan Bersama adalah " +
                "Politeknik yang didirikan oleh Yayasan Pendidikan Harapan Bersama ini dirancang khusus untuk menghasilkan tenaga ahli yang mandiri dan profesional. " +
                "Program pendidikan yang ada di politeknik ini menggunakan sistem pendidikan vokasional (70% praktik dan 30% teori), sehingga lulusannya dapat diserap oleh pasar kerja dan dapat menciptakan lapangan kerja bagi dirinya sendiri maupun orang lain."))

        data?.add(DataModel(R.drawable.udinus,"Universitas Dian Nuswantoro","Semarang",
            "Universitas Dian Nuswantoro adalah universitas swasta yang didirikan oleh Yayasan Dian Nuswantoro Semarang. " +
                "Yayasan ini terdiri dari beberapa sekolah tinggi yang memfokuskan di beberapa ilmu tertentu yaitu Sekolah Tinggi Manajemen Informatika dan Komputer, Sekolah Tinggi Ilmu Ekonomi, Sekolah Tinggi Bahasa Asing, dan Sekolah Tinggi Kesehatan. " +
                "Dasar dari penggabungan sekolah tinggi di bawah naungan Yayasan Dian Nuswantoro ini didasari atas upaya untuk meningkatkan efisiensi dan kinerja kelembagaan, sehingga menjadi organisasi yang sehat dalam mengelola pendidikan."))

        data?.add(DataModel(R.drawable.undip,"Universitas Diponegoro","Semarang",
            "Universitas Diponegoro merupakan salah satu kampus negeri unggulan yang memiliki sederet prestasi. Dari segi ranking kampus, Undip menduduki peringkat ke-5 sebagai kampus terbaik berdasarkan klasterisasi perguruan tinggi non-vokasi Kemenristekdikti 2018. " +
                "Nggak hanya diperhitungkan di dalam negeri aja, Kampus yang berada di kota Semarang ini juga mengoleksi berbagai prestasi di kancah internasional " +
                "Sebagai contoh, Undip menduduki Universitas Diponegoro menempati peringkat 50 World Greenmetrics Ranking (Peringkat 4 Indonesia). Lalu, menurut data QS Asia University Rankings, Universitas Diponegoro berhasil menduduki peringkat 281-290 pada tahun 2020."))

        data?.add(DataModel(R.drawable.akademikepolisian,"Akademi Kepolisian","Semarang",
            "Akademi Kepolisian (AKPOL) merupakan sebuah sekolah kedinasan milik Pemerintah RI yang berada di bawah naungan Kementerian Pertahanan Nasional RI. " +
                "Akademi Kepolisian memiliki jenjang pendidikan Diploma IV (DIV) yang jenjangnya setara dengan S1 " +
                "Akademi Kepolisian merupakan sekolah tinggi yang membentuk Perwira Polri. Bagi kamu yang punya jiwa nasionalisme tinggi dan ingin menjadi Perwira Polri, Akademi Kepolisian bisa menjadi pilihan untuk menimba ilmu"))

        data?.add(DataModel(R.drawable.akmil,"Akademi Militer (AKMIL)","Magelang",
            "Akademi Militer (AKMIL) merupakan sekolah kedinasan milik Pemerintah RI yang berada di bawah naungan Kementerian Pertahanan Nasional RI. " +
                "Akademi Militer memiliki jenjang pendidikan Diploma IV (DIV) yang setara dengan S1. " +
                "Akademi Militer merupakan sekolah tinggi yang mencetak Perwira TNI Angkatan Darat. Bagi kamu yang punya jiwa nasionalisme tinggi, Akademi Militer bisa jadi pilihan untuk melanjutkan pendidikan."))

        data?.add(DataModel(R.drawable.ums,"Universitas Muhammadiyah Surakarta","Surakarta",
            "Universitas Muhammadiyah Surakarta berdiri sejak tahun 1981. Universitas Muhammadiyah Surakarta (UMS) menjadi satu-satunya perguruan tinggi Muhammadiyah yang mampu menembus persaingan global " +
                "menjadi satu-satunya perguruan tinggi Muhammadiyah yang mampu menembus persaingan global " +
                "Hal ini dibuktikan dengan masuknya UMS menjadi salah satu dari 400 top university di Asia bersama 16 perguruan tinggi lainnya di Indonesia."))


        data?.add(DataModel(R.drawable.unsoed,"Universitas Jenderal Soedirman (Unsoed)","Purwokerto",
            "UNSOED terus melakukan inovasi dalam meningkatkan kualitas pendidikan, mulai dari riset dan penelitian hingga menjalin kerja sama dengan berbagai lembaga, perusahaan, dan juga instansi pendidikan di luar negeri. " +
                "Kampus ini memiliki tujuh bidang unggulan pada riset dan penelitian, mulai dari Biodiversitas Tropis dan Bioprospeksi; Pengelolaan Wilayah Kelautan, Pesisir, dan Pedalaman; " +
                "Pangan Gizi dan Kesehatan; Energi Baru dan Terbarukan; Kewirausahaan, Koperasi dan UMKM, Rekayasa Sosial; Pengembangan Pedesaan dan Pemberdayaan Masyarakat; serta Ilmu Dasar dan Rekayasa Keteknikan."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("kota", item?.kota)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}