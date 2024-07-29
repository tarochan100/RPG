package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	public Oak(String name,String weapon) {
		super(name,weapon);
		
		// ヒットポイントを170から230の間で設定
        this.setHp(Dice.get(170, 230));
        
        // 攻撃力を9から15の間で設定
        this.setOffensive(Dice.get(9, 15));
        
	}
}
