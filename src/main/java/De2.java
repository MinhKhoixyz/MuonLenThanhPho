package DeThi02;

public class De2 {
    public String diemTrungBinh(double diem) {
        if (diem < 0 || diem > 10) {
            throw new IllegalArgumentException("Ngoài phân vùng hợp lệ");
        }
        if (diem >= 9){
            return "Xuất sắc";
        } else if (diem >= 7) {
            return "Giỏi";
        } else if (diem >= 5) {
            return "Trung Bình";
        } else {
            return "Yếu";
        }
    }
}
