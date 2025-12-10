import DeThi02.De2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class De2Test {
    private De2 service;
    @BeforeEach
    void setUP(){
        service = new De2();
    }
    @Test
    void HL1(){
        double diem = 9.0;
        String mongMuon= "Xuất sắc";
        String thucTe = service.diemTrungBinh(diem);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    void HL2(){
        double diem = 1.0;
        String mongMuon = "Yếu";
        String thucTe = service.diemTrungBinh(diem);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    void HL3(){
        double diem = 3.0;
        String mongMuon = "Yếu";
        String thucTe = service.diemTrungBinh(diem);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    void HL4(){
        double diem = 7.0;
        String mongMuon = "Giỏi";
        String thucTe = service.diemTrungBinh(diem);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    void KHL_canBienDuoi(){
        assertThrows(IllegalArgumentException.class,() ->service.diemTrungBinh(-3));
    }
    @Test
    void KHL_CanBienTren(){
        assertThrows(IllegalArgumentException.class,() ->service.diemTrungBinh(13));
    }
}