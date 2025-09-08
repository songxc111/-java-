package img;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.UUID;

public class imgfile {
//    源文件目录 写上你自己的文件
    public static final String SOURCE_PATH = "";
//    目标文件目录 写上你自己的文件
    public static final String TARGET_PATH = "";
    public static void main(String[] args) {

        File f = new File(SOURCE_PATH);
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++) {
            if(files[i].isFile())
            files[i].renameTo(new File(TARGET_PATH+myFile.newFileName(files[i].getName())));
        }

    }
}
@Data
@NoArgsConstructor
class myFile{
    //s是文件名
    public static String newFileName(String s){
        LocalDate now = LocalDate.now();
        int i = s.indexOf(".");
        String substring = s.substring(i);
        String newname = UUID.randomUUID().toString()+now+substring;//文件新名字
        return newname;
    }
}