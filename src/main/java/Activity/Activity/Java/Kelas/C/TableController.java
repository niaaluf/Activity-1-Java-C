/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity.Activity.Java.Kelas.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author asus
 */
@Controller
public class TableController {
@RequestMapping("/dataktp")
//@ResponseBody
public String getTable(Model tiki){
    String result = "Selamat Datang";
   tiki.addAttribute("expedisi", result);
   
   //DataDiriKTP data = new DataDiriKTP();
   
   ArrayList<List<String>> data = new ArrayList<>();
   data.add(Arrays.asList("ID","No. KTP","Nama","Alamat"));
   data.add(Arrays.asList("1771","123456789123","Nia Audita","Jl. Merak"));
   data.add(Arrays.asList("1772","123456789124","Tara Azzahra","Jl. Tomampe"));
   data.add(Arrays.asList("1773","123456789125","Royan Rhamdianty","Jl. Macam"));
   data.add(Arrays.asList("1774","123456789126","Nurwinda","Jl. Setiabudi"));
   data.add(Arrays.asList("1775","123456789127","Fajar Pratama","Jl. Basuki Rahmat"));
   data.add(Arrays.asList("1776","123456789128","Maliq Raditya","Jl. Zebra"));
   data.add(Arrays.asList("1777","123456789129","Dewi Indah","Jl. Thamrin"));
   data.add(Arrays.asList("1778","123456789122","Alisa Aulia","Jl. Merpati"));
   data.add(Arrays.asList("1779","123456789121","Deara Syalita","Jl. Swadaya"));
   data.add(Arrays.asList("1781","123456789131","Wayan Nugraha","Jl. Maleo"));
   data.add(Arrays.asList("1782","123456789132","M. Nurhidayat","Jl. Garuda"));
   data.add(Arrays.asList("1783","123456789133","Wisnu","Jl. Veteran"));
   data.add(Arrays.asList("1785","123456789135","Nanda Anisa","Jl. Wahidin"));
   data.add(Arrays.asList("1786","123456789136","Isra Putri","Jl. Gadjah Mada"));
   data.add(Arrays.asList("1787","123456789137","Tsakief","Jl. Inpres"));
   data.add(Arrays.asList("1788","123456789138","Dwi Rezky","Jl. Palupi"));
   data.add(Arrays.asList("1789","123456789139","Aqila","Jl. Kedondong"));
   data.add(Arrays.asList("1791","123456789141","Zahra Gina","Jl. Asam"));
   data.add(Arrays.asList("1792","123456789142","Ragdah","Jl. Dewi Sartika"));
   
   tiki.addAttribute("datadiri", data);
    return "TableViewer";
}
    
    
}
