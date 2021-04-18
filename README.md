![HinhNen](HinhAnh/background.png)
# Quy định đặt tên branch

- nhom3_tên
  
**Ví dụ:** nhom3_anh

**Lưu ý:** Ai push lên sau, người đó phải sửa lỗi commit
# Week - 1: Giao Diện Android

- link challenge: https://drive.google.com/drive/folders/19jojkfanVrWe5Nk4ydbMbAHgYq2pBdZR
- link slide: https://docs.google.com/presentation/d/1Q6l47895hYow7WGJ_tWKcjNaeHA1M8RRiuyucREvsAI/edit?usp=sharing
- link record: https://youtu.be/Jv1_odUgu08
## Design lại các giao diện giao bằng xml

**Target:**

- Welcome: Bình
- Onboarding one: Đạt
- SignUp: Quốc
- Login: An
- Verification Code: Ngọc Anh
# Week - 2: Activity

- challenge: https://drive.google.com/drive/folders/1hOEmAzug_7xAYMSyu0PaUDGCb9U5GBPn?usp=sharing
- slide: https://docs.google.com/presentation/d/1_o-dlIPvrNXDnxgCMorBkBtphdMzK4OXqJgqCuxpD24/edit?usp=sharing
- link record: https://youtu.be/QGphPtTYN8E

**Target:**

- Tạo flow app sau: Bình, Quốc, Đạt
- Login: An
- Profile: Ngọc Anh

# Week-3: DataBinding - ViewModel - LiveData

- challenge: https://drive.google.com/file/d/1GTFMMz4vJZXotT33_avjz4F1yAN9YhrZ/view?usp=sharing
  
- slide: https://docs.google.com/presentation/d/1q_fVHC7UDNJtYuRkVnRfZLbSKC9YHY1QiVVB6ffVZa8/edit

- link record: https://www.youtube.com/watch?v=Vdm39k-x-eE
  
- demo code: https://github.com/namphho/Week3-Samnple
  
**Target:**

## Áp dụng Databinding & ViewModel & LiveData vào các màn hình sau

- SignUp: Bình, **An**, Quốc
   
  - Tạo Account mới ở màn hình SignUp (email/password)
  
  - **Gợi ý:** Tạo class DataStore (Singleton) để lưu thông tin SignUp
  
- LoginIn: Đạt
  
  - Sử dụng Account vừa tạo đăng nhập ở màn hình login
  
- Profile: Ngọc Anh
  
  - Hiển thị Info ở màn hình Profile

# Week 4: RecyclerView

- challenge: https://drive.google.com/drive/folders/1FkYRBJa2FbfwzBkfZGYynnfHG6-JuJGc?usp=sharing
- slide: https://docs.google.com/presentation/d/11vtGXvYHvG-PwRV4OXQcXDWShdnwGfUDQKkxKTF2IQ4/edit?usp=sharing
- demo code: https://github.com/namphho/W4-Demo.git
link record:  https://youtu.be/tA2YcMXj1wg


**Target:**

**Ngọc Anh, Bình**

- Validate quá trình SignUp Account: 

  - force user nhập đúng địa chỉ email. vd: nguyen.van.a@gmail.com (hợp lệ), nguyen.van.a@gmail
(không hợp lệ)

  - force user nhập passwrod phải theo qui tắc:
có ít nhất 8 ký tự
bao gồm có chữ hoa, chữ thường, số, và các ký tự sau: ! @ # $ % ^ & * ()

**Đạt, Quốc**

- Tạo object Restaurant với các thuộc tính sau sau:
   
  - Tên nhà hàng
  
  - Địa chỉ
  
  - Link ảnh avatar
  
- Tạo danh sách data dựa trên file db_restaurant.jl (file đính kèm) - lưu ý: danh sách có ít nhất 20 phần
tử

**An**

- Sau khi Đăng Nhập => hiển thị màn hình với danh sách đã tạo ở phía trên
  
- Sử dụng menu options, cho phép user chuyển kiểu hiển thị LinearLayoutManager <=>
GridLayoutManager

**Gợi ý:**

- Sử dụng Glide để load hình ảnh

- Sử dụng các field sau trong file DB để map data
Name

- Address
  
- PicturePath