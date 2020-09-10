# notification-hub

## Trendyol Tech Bootcamp Ödev

    * Firmalar bu uygulama ile sectikleri paket ve ucretlendirme tipine gore bildirim gonderebilmektedir
    * Dort farkli paket tipi vardir, firma birden fazla paket secebilir ve sectigi paketlere gore ucretlendirilir.
        * SMS Sabit Kotali: 1000 adet - 20TL ile sinirlidir. 1000 adeti asan gonderimde 20TL karsiliginda 1000 adet kota tekrar tanimlanir
        * SMS Esnek Kotali: 2000 adet - 30TL, 2000 adetten sonra ki her SMS 0.10TL dir
        * Email Sabit Kotali: 1000 adet - 10TL ile sinirlidir. 1000 adeti asan gonderimde 10TL karsiliginda 1000 adet kota tekrar tanimlanir
        * Email Esnek Kotali: 2000 adet - 7.5TL, 2000 adetten sonra ki her SMS 0.03TL dir
    * Firma bir gonderi grubu olusturabilir ve bu gruptaki kisilere bildirim gonderebilir.
    * Ucretlendirmeler aylik tutulur
    * Kayit tarihinden itibaren 2 ay odeme yapmayan firma black liste alinir ve gonderim aninda hata alir
    * Hata mesajlari firmanin sectigi dile gore degisebilir
