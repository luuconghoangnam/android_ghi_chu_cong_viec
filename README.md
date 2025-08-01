# ToDoList Ver1 - Ứng Dụng Quản Lý Công Việc

## 📱 Mô tả

ToDoList Ver1 là một ứng dụng Android đơn giản và hiệu quả để quản lý danh sách công việc hàng ngày. Ứng dụng cung cấp đầy đủ các tính năng cơ bản như thêm, sửa, xóa, tìm kiếm công việc với giao diện thân thiện và dễ sử dụng.

## ✨ Tính năng chính

- **Quản lý công việc**: Thêm, sửa, xóa công việc
- **Tìm kiếm thông minh**: Tìm kiếm công việc theo từ khóa
- **Chọn và chỉnh sửa**: Click để chọn và chỉnh sửa công việc
- **Xóa an toàn**: Long click để xóa với dialog xác nhận
- **Lưu thay đổi**: Cập nhật công việc đã chỉnh sửa
- **Giao diện trực quan**: Hiển thị công việc đang chọn
- **Thoát ứng dụng**: Dialog xác nhận khi thoát

## 🛠️ Công nghệ sử dụng

- **Ngôn ngữ**: Java
- **Framework**: Android SDK
- **UI Components**:
  - ListView (hiển thị danh sách công việc)
  - EditText (nhập và tìm kiếm công việc)
  - Button (thêm, lưu, thoát)
  - TextView (hiển thị thông tin)
  - ArrayAdapter (kết nối dữ liệu với ListView)
  - AlertDialog (xác nhận xóa)
  - Toast (thông báo)

## 📱 Giao diện

- **Danh sách công việc**: ListView hiển thị tất cả công việc
- **Ô nhập công việc**: EditText để thêm/sửa công việc
- **Ô tìm kiếm**: EditText với tính năng lọc real-time
- **Thông tin chọn**: Hiển thị công việc đang được chọn
- **Nút thêm**: Thêm công việc mới
- **Nút lưu**: Cập nhật công việc đã chỉnh sửa
- **Nút thoát**: Đóng ứng dụng

## 🚀 Cách sử dụng

### Thêm công việc mới
1. Nhập nội dung công việc vào ô "Công việc"
2. Nhấn nút "Thêm CV"
3. Công việc sẽ được thêm vào danh sách

### Chỉnh sửa công việc
1. Click vào công việc cần sửa trong danh sách
2. Nội dung sẽ hiển thị trong ô "Công việc"
3. Chỉnh sửa nội dung
4. Nhấn nút "Lưu CV" để cập nhật

### Xóa công việc
1. Long click (nhấn giữ) vào công việc cần xóa
2. Chọn "Đồng ý" trong dialog xác nhận
3. Công việc sẽ bị xóa khỏi danh sách

### Tìm kiếm công việc
1. Nhập từ khóa vào ô "Tìm kiếm"
2. Danh sách sẽ tự động lọc theo từ khóa
3. Xóa từ khóa để hiển thị lại toàn bộ danh sách

## 📋 Dữ liệu mẫu ban đầu

- "Rửa bát"
- "Học lập trình di động"  
- "Ôn thi Tiếng Anh VSTEP"

## ⚠️ Xử lý lỗi

- Kiểm tra nội dung không rỗng khi thêm công việc
- Xác nhận trước khi xóa công việc
- Thông báo Toast cho các hành động thành công
- Xử lý trạng thái chọn/bỏ chọn công việc

## 🔍 Tính năng nổi bật

- **Real-time search**: Tìm kiếm ngay khi gõ
- **Smart selection**: Hiển thị index và nội dung công việc được chọn
- **Intuitive UX**: Click để chọn, long click để xóa
- **Data persistence**: Duy trì dữ liệu trong phiên làm việc

## 📋 Yêu cầu hệ thống

- Android 7.0 (API level 24) trở lên
- Android Studio Flamingo hoặc mới hơn
- Java 8+

## 🔧 Cài đặt và chạy

1. Clone repository này
2. Mở project trong Android Studio
3. Sync Gradle files
4. Chạy ứng dụng trên device hoặc emulator

## 📝 Ghi chú

- Package name: `com.example.todolist_ver1`
- Theme: `Theme.ToDoList_Ver1`
- Minimum SDK: 24
- Target SDK: 34
- Sử dụng ArrayAdapter cho ListView

## 🔮 Phát triển tương lai

- Lưu trữ dữ liệu persistent (SQLite/Room)
- Thêm deadline cho công việc
- Phân loại công việc theo mức độ ưu tiên
- Giao diện Material Design
- Sync với cloud storage

## 👨‍💻 Tác giả

Lưu Lâm Công - Phát triển trong khóa học lập trình Android

---
*Ứng dụng được phát triển cho mục đích học tập và thực hành lập trình Android, tập trung vào ListView và quản lý dữ liệu cơ bản.*
