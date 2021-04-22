package com.laptrinhdidong.nhom3.btvntuan1

import androidx.lifecycle.MutableLiveData
import com.laptrinhdidong.nhom3.btvntuan1.Activity.ListRestaurant.Restaurant

object DataStore {
    private var list: MutableList<Account> = mutableListOf()
    ///hàn lấy ra tất cả account (dùng để so sánh ở trang login)
    fun getListAccount():MutableList<Account>
    {
        return list
    }
    ///hàm thêm mới account (dùng ở trang signup)
    fun addAccount(account: Account)
    {
        list.add(account)
    }
    ///các hàm set (dùng ở trang profile)
    fun setFullNameAccount(index: Int?,fullname : String)
    {
        list[index!!].fullname=fullname
    }
    fun setEmailAccount(index: Int?,email: String)
    {
        list[index!!].email=email
    }
    fun setPhoneAccount(index: Int?,phone: String)
    {
        list[index!!].phone = phone
    }

    //DataStore for Restaurant List
    fun getDataSet(): List<Restaurant>{
        return listOf(
                Restaurant("33760", "Du Miên Garden Cafe - Phan Văn Trị", "7 Phan Văn Trị, P. 10", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g1/978/prof/s640x400/foody-mobile-countryhouse-jpg-246-635683259648435945.jpg",R.drawable.cf1),
                Restaurant("978", "Country House Cafe", "18C Phan Văn Trị, P. 10", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g9/82801/prof/s640x400/foody-upload-api-foody-mobile-gi4-jpg-181001160804.jpg",R.drawable.cf6),
                Restaurant("82801", "Hẻm Spaghetti - Nguyễn Oanh", "212/22 Nguyễn Oanh, P. 17", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g15/149154/prof/s640x400/foody-upload-api-foody-mobile-4-190111100956.jpg",R.drawable.cf2),
                Restaurant("149154", "Lava Coffee - Quang Trung", "61 Quang Trung, P. 10", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g4/33645/prof/s640x400/foody-mobile-bayef6n3-jpg-308-636023635570133301.jpg",R.drawable.cf3),
                Restaurant("194867", "Mì Cay Naga - 224 Phạm Văn Đồng", "224 Phạm Văn Đồng, P.1 ", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g26/252442/prof/s180x180/foody-mobile-12-jpg-323-636148043123028599.jpg",R.drawable.cf4),
                Restaurant("25656", "City House Cafe - Sân Vườn Lãng Mạn", "21 Huỳnh Khương An, P. 5", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g26/252442/prof/s640x400/foody-mobile-12-jpg-323-636148043123028599.jpg",R.drawable.cf5),
                Restaurant("66844", "Nhi Nhi Quán - Đặc Sản Phan Rang", "125/48 Lê Đức Thọ, P. 17", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g2/12513/prof/s640x400/foody-mobile-oasis-cafe-tp-hcm.jpg",R.drawable.cf6),
                Restaurant("33645", "Yuri Yuri - Ẩm Thực Hàn Quốc", "358 Nguyễn Văn Nghi, P. 7", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g2/12513/prof/s640x400/foody-mobile-oasis-cafe-tp-hcm.jpg",R.drawable.cf1),
                Restaurant("252442", "Trà Sữa Gong Cha - 貢茶 - Phan Văn Trị", "595 Phan Văn Trị, P. 5", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g20/199622/prof/s180x180/201652411519-mobile-foody-logo-2-640x400.jpg",R.drawable.cf2),
                Restaurant("12513", "Oasis Cafe", "26/14 Phạm Văn Đồng, P. 3", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g20/199622/prof/s640x400/201652411519-mobile-foody-logo-2-640x400.jpg",R.drawable.cf6),
                Restaurant("199622", "Buzza Pizza - Emart Gò Vấp", "Tầng Trệt Emart Gò Vấp - 366 Phan Văn Trị, P. 5", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g20/199622/prof/s640x400/201652411519-mobile-foody-logo-2-640x400.jpg",R.drawable.cf5),
                Restaurant("651063", "Dallas Cakes & Coffee - Quang Trung", "6 Quang Trung, P. 10", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g66/651063/prof/s640x400/foody-mobile-11090821_80492442289-251-636277684533992519.jpg",R.drawable.cf2),
                Restaurant("60915", "Hot & Cold - Trà Sữa & Xiên Que - Quang Trung", "804 Quang Trung", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g66/651063/prof/s640x400/foody-mobile-11090821_80492442289-251-636277684533992519.jpg",R.drawable.cf4),
                Restaurant("112585", "Papaxốt - Quang Trung", "458 Quang Trung", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g26/255841/prof/s180x180/foody-mobile-img_8465-jpg.jpg",R.drawable.cf3),
                Restaurant("91979", "SaiGon Chic Cafe", "82 Đường Số 27, P. 6", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g9/82801/prof/s640x400/foody-upload-api-foody-mobile-gi4-jpg-181001160804.jpg",R.drawable.cf6),
                Restaurant("28883", "Pizza Hut - Quang Trung", "283 Quang Trung", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g15/149154/prof/s640x400/foody-upload-api-foody-mobile-4-190111100956.jpg",R.drawable.cf1),
                Restaurant("129725", "Bánh Mì Chảo & Món Ngon Hoa Việt - Quán Cô 3 Hậu", "36 Đường Số 18, P. 8", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g2/12513/prof/s640x400/foody-mobile-oasis-cafe-tp-hcm.jpg",R.drawable.cf4),
                Restaurant("46668", "Kichi Kichi Lẩu Băng Chuyền - Quang Trung", "1 Quang Trung", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g20/199622/prof/s640x400/201652411519-mobile-foody-logo-2-640x400.jpg",R.drawable.cf3),
                Restaurant("158187", "The Coffee House - Quang Trung", "293 Quang Trung", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g1/978/prof/s640x400/foody-mobile-countryhouse-jpg-246-635683259648435945.jpg",R.drawable.cf5),
                Restaurant("30102", "Cánh Đồng Quán - Lẩu Nướng Tại Bàn - Dương Quảng Hàm", "310/14 Dương Quảng Hàm, P. 5", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g26/252442/prof/s180x180/foody-mobile-12-jpg-323-636148043123028599.jpg",R.drawable.cf4),
                Restaurant("83857", "Chú Tèo Buffet Nướng 99K - K26 Dương Quảng Hàm", "N01 Chung Cư K26 Dương Quảng Hàm, P. 7", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g2/12513/prof/s640x400/foody-mobile-oasis-cafe-tp-hcm.jpg",R.drawable.cf3),
                Restaurant("212102", "Food Court - E Mart Gò Vấp", "Tầng Trệt E - Mart Gò Vấp, 168 Phan Văn Trị, P. 5", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g26/255841/prof/s180x180/foody-mobile-img_8465-jpg.jpg",R.drawable.cf5),
                Restaurant("67764", "Bánh Tráng Deli & Xiên Que - Lê Đức Thọ", "730/7/5 Lê Đức Thọ, P. 15", "Quận Gò Vấp", "TP. HCM", "https://images.foody.vn/res/g26/252442/prof/s640x400/foody-mobile-12-jpg-323-636148043123028599.jpg",R.drawable.cf2),


                )


    }

}
