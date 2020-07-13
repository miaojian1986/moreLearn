package xianglin.hotel.morelearn.annotation;

import androidx.annotation.IntDef;

@IntDef({ConstantTool.SHANGHAI, ConstantTool.SHENZHEN, ConstantTool.HANGZHOU, ConstantTool.BEIJING})
public @interface ConstantTool {
    int SHANGHAI = 0;
    int SHENZHEN = 1;
    int HANGZHOU = 2;
    int BEIJING = 3;

}
