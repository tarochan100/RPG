package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	public Brave(String name,String weapon) {
		super(name,weapon);
		
		// ヒットポイントを170から230の間で設定
        this.setHp(Dice.get(170, 230));
        
        // 攻撃力を7から13の間で設定
        this.setOffensive(Dice.get(7, 13));
	}
}
