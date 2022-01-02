package pojo.ex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CaseModelConstructor {
    public static void main(String[] args) {
        CaseModelConstructor caseModelConstructor = new CaseModelConstructor();
        System.out.println(caseModelConstructor.getCaseModel());


    }

    public InnerDomain getCaseModel() {
    MenuItem menuItem1 = new MenuItem();
    MenuItem menuItem2 = new MenuItem();
    MenuItem menuItem3 = new MenuItem();

    Popup popup = new Popup();
    ArrayList <MenuItem> arrayList = new ArrayList<>();
    arrayList.add(menuItem1);
    arrayList.add(menuItem2);
    arrayList.add(menuItem3);

    menuItem1.setOnclick("CreateNewDoc()");
    menuItem2.setOnclick("OpenDoc()");
    menuItem3.setOnclick("CloseDoc()");
    menuItem1.setValue("New");
    menuItem2.setValue("Open");
    menuItem3.setValue("Close");

    InnerDomain innerDomain = new InnerDomain();
    innerDomain.setId("file");
    innerDomain.setValue("File");
    innerDomain.setPopup(popup);

    return innerDomain;
    }
}
