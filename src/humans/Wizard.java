package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	public Wizard(String name,String weapon) {
		super(name,weapon);
		
		// ヒットポイントを120から180の間で設定
        this.setHp(Dice.get(120, 180));
        
        // 攻撃力を12から18の間で設定
        this.setOffensive(Dice.get(12, 18));
        
	}
}
