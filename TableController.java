/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity.Satu.Activity.Satu.FebriyantiAzahra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Febriyanti Azahra
 */
@Controller
public class TableController {
    @RequestMapping("/dataktp")
    //@ResponseBody
    public String getTable(Model data){
               
        ArrayList<List<String>> ktp = new ArrayList<>();
        
        ktp.add(0,Arrays.asList("ID","No. KTP","Nama","Alamat"));
        ktp.add(1,Arrays.asList("01","9212095601","Dania","Jakarta"));
        ktp.add(2,Arrays.asList("02","9287531808","Haykal","Bandung"));
        ktp.add(3,Arrays.asList("03","9287531168","Putri","Malang"));
        ktp.add(4,Arrays.asList("04","9287561458","Rizky","Palembang"));
        ktp.add(5,Arrays.asList("05","9287532982","Raihan","Bantul"));
        ktp.add(6,Arrays.asList("06","9287590154","Miftah","Bekasi"));
        ktp.add(7,Arrays.asList("07","9287590681","Rania","Tangerang"));
        ktp.add(8,Arrays.asList("08","9287591903","Friska","Balikpapan"));
        ktp.add(9,Arrays.asList("09","9287590815","Lisa","Ambon"));
        ktp.add(10,Arrays.asList("010","9287597252","Nia","Yogyakarta"));
        ktp.add(11,Arrays.asList("011","9287580167","Wulandari","Jakarta"));
        ktp.add(12,Arrays.asList("012","9287590193","Sekar","Pekanbaru"));
        ktp.add(13,Arrays.asList("013","9287591873","Asil","Bandung"));
        ktp.add(14,Arrays.asList("014","9287512657","Arif","Papua"));
        ktp.add(15,Arrays.asList("015","9287593189","Gemal","Medan"));
        ktp.add(16,Arrays.asList("016","9287592029","Zahra","Yogyakarta"));
        ktp.add(17,Arrays.asList("017","9287539252","Nikita","Manado"));
        ktp.add(18,Arrays.asList("018","9287519280","Anita","Palu"));
        ktp.add(19,Arrays.asList("019","9287517259","Diva","Makassar"));
        ktp.add(20,Arrays.asList("020","9287482916","Kenzi","Jakarta"));
        
        data.addAttribute("tabel", ktp);
        return "view";
    } 
}
