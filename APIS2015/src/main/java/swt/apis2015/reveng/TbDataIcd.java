package swt.apis2015.reveng;
// Generated 16.06.2015 20:49:58 by Hibernate Tools 4.3.1
/*
Generierte Klasse zur ICD10 DB, darf nicht ins entity Paket!
Sonst wird auch die APIS2015 DB im bottom up Prinzip(ReverseEngeneering) erstellt

*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TbDataIcd generated by hbm2java
 */
@Entity
@Table(name="tb_data_icd"
    ,catalog="icd"
)
public class TbDataIcd  implements java.io.Serializable {


     private Integer id;
     private Integer col1;
     private String col2;
     private String col3;
     private Integer col4;
     private String col5;
     private String col6;
     private String col7;
     private String col8;
     private String col9;
     private String col10;
     private String col11;
     private String col12;
     private String col13;
     private String col14;

    public TbDataIcd() {
    }

    public TbDataIcd(Integer col1, String col2, String col3, Integer col4, String col5, String col6, String col7, String col8, String col9, String col10, String col11, String col12, String col13, String col14) {
       this.col1 = col1;
       this.col2 = col2;
       this.col3 = col3;
       this.col4 = col4;
       this.col5 = col5;
       this.col6 = col6;
       this.col7 = col7;
       this.col8 = col8;
       this.col9 = col9;
       this.col10 = col10;
       this.col11 = col11;
       this.col12 = col12;
       this.col13 = col13;
       this.col14 = col14;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="col1")
    public Integer getCol1() {
        return this.col1;
    }
    
    public void setCol1(Integer col1) {
        this.col1 = col1;
    }

    
    @Column(name="col2", length=1)
    public String getCol2() {
        return this.col2;
    }
    
    public void setCol2(String col2) {
        this.col2 = col2;
    }

    
    @Column(name="col3", length=1)
    public String getCol3() {
        return this.col3;
    }
    
    public void setCol3(String col3) {
        this.col3 = col3;
    }

    
    @Column(name="col4")
    public Integer getCol4() {
        return this.col4;
    }
    
    public void setCol4(Integer col4) {
        this.col4 = col4;
    }

    
    @Column(name="col5", length=3)
    public String getCol5() {
        return this.col5;
    }
    
    public void setCol5(String col5) {
        this.col5 = col5;
    }

    
    @Column(name="col6", length=6)
    public String getCol6() {
        return this.col6;
    }
    
    public void setCol6(String col6) {
        this.col6 = col6;
    }

    
    @Column(name="col7", length=5)
    public String getCol7() {
        return this.col7;
    }
    
    public void setCol7(String col7) {
        this.col7 = col7;
    }

    
    @Column(name="col8", length=4)
    public String getCol8() {
        return this.col8;
    }
    
    public void setCol8(String col8) {
        this.col8 = col8;
    }

    
    @Column(name="col9", length=185)
    public String getCol9() {
        return this.col9;
    }
    
    public void setCol9(String col9) {
        this.col9 = col9;
    }

    
    @Column(name="col10", length=5)
    public String getCol10() {
        return this.col10;
    }
    
    public void setCol10(String col10) {
        this.col10 = col10;
    }

    
    @Column(name="col11", length=5)
    public String getCol11() {
        return this.col11;
    }
    
    public void setCol11(String col11) {
        this.col11 = col11;
    }

    
    @Column(name="col12", length=5)
    public String getCol12() {
        return this.col12;
    }
    
    public void setCol12(String col12) {
        this.col12 = col12;
    }

    
    @Column(name="col13", length=5)
    public String getCol13() {
        return this.col13;
    }
    
    public void setCol13(String col13) {
        this.col13 = col13;
    }

    
    @Column(name="col14", length=5)
    public String getCol14() {
        return this.col14;
    }
    
    public void setCol14(String col14) {
        this.col14 = col14;
    }




}


