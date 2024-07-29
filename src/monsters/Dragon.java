package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	public Dragon(String name,String weapon) {
		super(name,weapon);
		
		 // ヒットポイントを270から330の間で設定
        this.setHp(Dice.get(270, 330));
        
        // 攻撃力を12から18の間で設定
        this.setOffensive(Dice.get(12, 18));
        
	}


}
