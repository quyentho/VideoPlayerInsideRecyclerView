package app.videoplayerinsiderecyclerview.models.reposatories

import androidx.lifecycle.MutableLiveData
import app.videoplayerinsiderecyclerview.models.MediaObject
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.addTo

class MediaRepo {
    // dummy data for get list of media objects
    public fun getMediaData(): MutableLiveData<MutableList<MediaObject>> {
        val data: MutableLiveData<MutableList<MediaObject>> = MutableLiveData()
        val listOfStrings = listOf("https://videos.ecommerce.kiemtradoanhthuwesaam.info/2dgcn0rr.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/laxin2xz.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/rc3t1qx2.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/4tnj54jo.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/mvyycbma.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/wzgtdmin.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/x0ejr3nv.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/wta5e2hr.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/guawp13y.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/fugigket.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/ybmxnjnm.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/uavho301.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/4ehg2zc3.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/mx3irkp5.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/w1avt4pi.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/n2t2cia5.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/3cfcwibl.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/v5k3knzq.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/4tdxeo2e.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/e5u3po41.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/lxuzgsxr.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/c1zmhn3q.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/iazsbrwp.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/h0f3j13h.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/gprsfmvr.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/l1wkkumw.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/01twpc5k.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/r2pg31ko.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/pkz5oitg.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/0qbyzzfm.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/zsa4zj3s.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/hwknpyuo.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/uyy2rpv1.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/pfhc5kak.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/nysg4n0y.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/2cxrlq43.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/4g0b4tjs.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/djfi5shl.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/ty2i0gxt.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/epspgaid.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/zfeas0hf.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/gdxyuzlt.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/2bft4ydu.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/y4m5fawx.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/ho02t13i.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/nrhihkfv.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/i1emi04o.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/ldhgxmus.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/vbyuhitt.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/cjdywies.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/mw2ivnw2.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/kk0xrtpl.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/0i1gv2d0.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/mxdvw0i0.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/kygyzcz5.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/ge1qxvye.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/axdtkl02.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/4aknbuxz.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/vjwskm45.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/mpn2ainl.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/az4q3bzw.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/zgmsh1zb.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/cgzy0w1s.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/gvtrcmmu.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/4w3lbpch.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/ol00dx2e.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/r3yjlnit.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/wpuimsnk.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/q2bnc3oc.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/grjttlda.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/0a4xivis.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/1kxmvfwt.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/nwphpwes.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/43slvajl.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/grzhsesj.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/hczrvqbe.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/cyu1fscm.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/ncxrkslw.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/o43smnqu.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/zfstm4rv.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/oxnlklho.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/hmlzdyqv.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/gf1rtyp5.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/qhanhvsq.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/zfn1ju1a.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/p4s1daj4.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/1fpxumik.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/fvi2i1t0.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/yanyceps.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/fu3ygmdt.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/0wwme2gs.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/4qk2onkn.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/niz2nz3e.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/u1zlarfz.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/jdnv3p2g.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/rvpjjzar.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/ns5fvu0f.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/dyrhf2lr.mp4",
            "https://videos.ecommerce.kiemtradoanhthuwesaam.info/0zxicmrh.mp4") // Your list of strings

        val mediaObjects: MutableList<MediaObject> = listOfStrings.map { title ->
            MediaObject(title)
        }.toMutableList()

        val dataObservable = Observable.create<MutableList<MediaObject>> {
            it.onNext(
                mediaObjects
            )

            it.onComplete()
        }

        dataObservable.subscribe {
            data.value = it
        }.addTo(CompositeDisposable())

        return data
    }
}