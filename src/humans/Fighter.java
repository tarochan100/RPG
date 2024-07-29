package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	public Fighter(String name,String weapon) {
		super(name,weapon);
		
		// ヒットポイントを240から300の間で設定
        this.setHp(Dice.get(240, 300));
        
        // 攻撃力を17から23の間で設定
        this.setOffensive(Dice.get(17, 23));
        
	}
}
