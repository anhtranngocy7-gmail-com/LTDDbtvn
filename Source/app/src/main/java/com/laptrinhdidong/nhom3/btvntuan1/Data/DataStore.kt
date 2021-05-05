package com.laptrinhdidong.nhom3.btvntuan1

import androidx.lifecycle.MutableLiveData
import com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.Restaurant

object DataStore {
    private var list: MutableList<Account> = mutableListOf()
    private var listRestaurant: List<Restaurant> = listOf(
        Restaurant(
            false,
            "33760",
            "Du Miên Garden Cafe - Phan Văn Trị",
            "7 Phan Văn Trị, P. 10",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g4/33760/prof/s640x400/foody-mobile-du-mien-garden-mb-jp-309-635785114907746480.jpg",
            R.drawable.cf1
        ),
        Restaurant(
            false,
            "978",
            "Country House Cafe",
            "18C Phan Văn Trị, P. 10",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g1/978/prof/s640x400/foody-mobile-countryhouse-jpg-246-635683259648435945.jpg",
            R.drawable.cf6
        ),
        Restaurant(
            false,
            "82801",
            "Hẻm Spaghetti - Nguyễn Oanh",
            "212/22 Nguyễn Oanh, P. 17",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g9/82801/prof/s640x400/foody-upload-api-foody-mobile-gi4-jpg-181001160804.jpg",
            R.drawable.cf2
        ),
        Restaurant(
            false,
            "149154",
            "Lava Coffee - Quang Trung",
            "61 Quang Trung, P. 10",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g15/149154/prof/s640x400/foody-upload-api-foody-mobile-4-190111100956.jpg",
            R.drawable.cf3
        ),
        Restaurant(
            false,
            "194867",
            "Mì Cay Naga - 224 Phạm Văn Đồng",
            "224 Phạm Văn Đồng, P.1 ",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g20/194867/prof/s640x400/foody-mobile-9zbk996o-jpg-112-636143635496125338.jpg",
            R.drawable.cf4
        ),
        Restaurant(
            false,
            "25656",
            "City House Cafe - Sân Vườn Lãng Mạn",
            "21 Huỳnh Khương An, P. 5",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g3/25656/prof/s640x400/foody-mobile-city-house-jpg-354-636133373358973749.jpg",
            R.drawable.cf5
        ),
        Restaurant(
            false,
            "66844",
            "Nhi Nhi Quán - Đặc Sản Phan Rang",
            "125/48 Lê Đức Thọ, P. 17",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g4/33645/prof/s640x400/foody-mobile-bayef6n3-jpg-308-636023635570133301.jpg",
            R.drawable.cf6
        ),
        Restaurant(
            false,
            "33645",
            "Yuri Yuri - Ẩm Thực Hàn Quốc",
            "358 Nguyễn Văn Nghi, P. 7",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g26/252442/prof/s640x400/foody-mobile-12-jpg-323-636148043123028599.jpg",
            R.drawable.cf1
        ),
        Restaurant(
            false,
            "252442",
            "Trà Sữa Gong Cha - 貢茶 - Phan Văn Trị",
            "595 Phan Văn Trị, P. 5",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g7/66844/prof/s640x400/foody-mobile-bpzy3ni3-jpg-841-636143721820688231.jpg",
            R.drawable.cf2
        ),
        Restaurant(
            false,
            "12513",
            "Oasis Cafe",
            "26/14 Phạm Văn Đồng, P. 3",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g2/12513/prof/s640x400/foody-mobile-oasis-cafe-tp-hcm.jpg",
            R.drawable.cf6
        ),
        Restaurant(
            false,
            "199622",
            "Buzza Pizza - Emart Gò Vấp",
            "Tầng Trệt Emart Gò Vấp - 366 Phan Văn Trị, P. 5",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g20/199622/prof/s640x400/201652411519-mobile-foody-logo-2-640x400.jpg",
            R.drawable.cf5
        ),
        Restaurant(
            false,
            "651063",
            "Dallas Cakes & Coffee - Quang Trung",
            "6 Quang Trung, P. 10",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g66/651063/prof/s640x400/foody-mobile-11090821_80492442289-251-636277684533992519.jpg",
            R.drawable.cf2
        ),
        Restaurant(
            false,
            "60915",
            "Hot & Cold - Trà Sữa & Xiên Que - Quang Trung",
            "804 Quang Trung",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g7/60915/prof/s640x400/foody-upload-api-foody-mobile-1-190605180036.jpg",
            R.drawable.cf4
        ),
        Restaurant(
            false,
            "112585",
            "Papaxốt - Quang Trung",
            "458 Quang Trung",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g12/112585/prof/s640x400/foody-upload-api-foody-mobile-7-190109171633.jpg",
            R.drawable.cf3
        ),
        Restaurant(
            false,
            "91979",
            "SaiGon Chic Cafe",
            "82 Đường Số 27, P. 6",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g10/91979/prof/s640x400/foody-mobile-kjuxujry-jpg-982-635838930416211667.jpg",
            R.drawable.cf6
        ),
        Restaurant(
            false,
            "28883",
            "Pizza Hut - Quang Trung",
            "283 Quang Trung",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g3/28883/prof/s640x400/foody-mobile-p-jpg-800-635757703358128351.jpg",
            R.drawable.cf1
        ),
        Restaurant(
            false,
            "129725",
            "Bánh Mì Chảo & Món Ngon Hoa Việt - Quán Cô 3 Hậu",
            "36 Đường Số 18, P. 8",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g13/129725/prof/s640x400/foody-mobile-foody-quan-co-3-hau--960-635652896252263911.jpg",
            R.drawable.cf4
        ),
        Restaurant(
            false,
            "46668",
            "Kichi Kichi Lẩu Băng Chuyền - Quang Trung",
            "1 Quang Trung",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g5/46668/prof/s640x400/foody-mobile-rfokfbsk-jpg-859-635796372049634356.jpg",
            R.drawable.cf3
        ),
        Restaurant(
            false,
            "158187",
            "The Coffee House - Quang Trung",
            "293 Quang Trung",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g16/158187/prof/s640x400/foody-mobile-coffeehousequangtrun-822-635754530645782536.jpg",
            R.drawable.cf5
        ),
        Restaurant(
            false,
            "30102",
            "Cánh Đồng Quán - Lẩu Nướng Tại Bàn - Dương Quảng Hàm",
            "310/14 Dương Quảng Hàm, P. 5",
            "Quận Gò Vấp",
            "TP. HCM",
            "https://images.foody.vn/res/g4/30102/prof/s640x400/foody-mobile-shwadjuj-jpg-413-636204369735412311.jpg",
            R.drawable.cf4
        )
    )

    ///hàn lấy ra tất cả account (dùng để so sánh ở trang login)
    fun getListAccount(): MutableList<Account> {
        return list
    }

    ///hàm thêm mới account (dùng ở trang signup)
    fun addAccount(account: Account) {
        list.add(account)
    }

    ///các hàm set (dùng ở trang profile)
    fun setFullNameAccount(index: Int?, fullname: String) {
        list[index!!].fullname = fullname
    }

    fun setEmailAccount(index: Int?, email: String) {
        list[index!!].email = email
    }

    fun setPhoneAccount(index: Int?, phone: String) {
        list[index!!].phone = phone
    }

    //DataStore for Restaurant List
    fun getDataSet(): List<Restaurant> {
        return listRestaurant
    }
    fun getFavoriteSet():List<Restaurant> {
        val listfavorite = mutableListOf<Restaurant>()
        for(item in DataStore.getDataSet())
        {
            if(item.Favorite==true)
            {
                listfavorite.add(item)
            }
        }
    return listfavorite
    }
    fun setFavorite(favorite: Boolean, index:Int){
        listRestaurant[index].Favorite=favorite
    }
}
