# project-se-e-book กลุ่มหนูมาคนเดียวค่ะ

## คณะผู้จัดทำ

1. 6310451065 นางสาวชวัลกร รสิตา หมู่เรียน 200
2. 6310451260 นางสาวปาณิสรา วงษ์บุบผา หมู่เรียน 200
3. 6310451286 นายพงศ์ศิริ เจริญกฤตยาวุฒิ หมู่เรียน 200
4. 6310451375 นางสาวศศิกานธ์ บุญวัฒน์ หมู่เรียน 200

## E-Book Web Application
  เป็น Web Application ขายหนังสือ E-Book ผ่านทางเว็บไซต์ โดยจะมีระบบสำหรับ _**ผู้ใช้ทั่วไป (User)**_ และ _**ผู้ดูแลระบบ (Admin)**_
ซึ่งมี Feature ดังต่อไปนี้
* **User**
  * 1. ลงทะเบียนผู้ใช้ใหม่
  * 2. เข้าสู่ระบบ
  * 3. กดดูรายละเอียดหนังสือ E-Book
  * 4. ซื้อหนังสือ E-Book
* **Admin**
  * 1. ลงทะเบียนผู้ใช้ใหม่
  * 2. เข้าสู่ระบบ
  * 3. เพิ่มหนังสือ E-Book
  * 4. แก้ไขข้อมูลหนังสือ E-Book
  * 5. ลบหนังสือ E-Book
  
## ความต้องการของโปรแกรมและขั้นตอนการติดตั้งโปรแกรม

### โปรแกรมที่ต้องการ
* IntelliJ IDEA สำหรับ run โปรแกรมที่เป็นส่วน Front-End และ Back-End
* XAMPP สำหรับเชื่อมฐานข้อมูล MySQL และเชื่อมต่อกับ Apache

### ขั้นตอนการติดตั้งและเปิดใช้งานโปรแกรม
1. ใช้คำสั่ง git clone หรือดาวน์โหลดไฟล์ zip จาก 
  * [GitHub-Front-End](https://github.com/cwkra/project-se-e-book-frontend.git)
  * [GitHub-Back-End](https://github.com/cwkra/project-se-e-book-backend.git)
2. เปิดโปรแกรม XAMPP และกด Start ที่ Module Apache และ MySQL
3. เข้าเว็บไซต์ [Localhost](http://localhost/phpmyadmin) และสร้าง Database ชื่อ  _**book_db**_
4. run โปรแกรมส่วน Back-End และ Front-End เพื่อใช้งานเว็บไซต์
5. เข้าเว็บไซต์ [E-Book Web Application](http://localhost:8091/) เพื่อใช้งานโปรแกรม
