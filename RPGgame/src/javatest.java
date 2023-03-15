public class Character {

    String name;    //이름
    int maxHp;      //최대체력
    int maxMp;      //최대마나
    int hp;         //체력
    int mp;         //마나
    int att;        //공격력
    int def;	    //방어력
    int level;      //레벨
    int exp;        //경험치
    Item[] items;   //보유아이템

	
    //생성자를 만들어서 변수들을 초기화 - 외부에서 값을 받아와야 해서 파라미터를 만듦
    Character(String name, int hp, int mp, int att, int def){
        this.name = name;
        this.maxHp = hp;
        this.maxMp = mp;
        this.hp = this.maxHp;
        this.mp = this.maxMp;
        this.att = att;
        this.def = def;
        this.level = 1;
        this.exp = 0;
        this.items = new Item[10]; //10칸짜리 배열 생성
    }

    //상태창
    void showInfo(){
        System.out.println("================================");
        System.out.println("-------------- 상태 --------------");
        System.out.println("이름 : " + name);
        System.out.println("레벨 : " + level + "(" + exp + "/100)");
        System.out.println("체력 : " + hp + "/" + maxHp);
        System.out.println("마나 : " + mp + "/" + maxMp);
        System.out.println("공격 : " + att);
        System.out.println("방어 : " + def);
        System.out.println("-------------- 아이템 -------------");
        for(int i = 0; i <items.length;i++){
            if(items[i] != null){
                System.out.println(items[i]);
            }
        }
        System.out.println("==================================");
    }

    //몬스터를 공격하는 메서드
    void attack(Monster m){//캐릭터의 공격력-몬스터의 방어력
        int damage = 0;
        if(att > m.def){
            damage = att - m.def;
        }else if(att == m.def){
            damage = 1;
        }
        m.hp -= damage;
        System.out.println(damage);

        //선생님 코드
	/*int damage = att - m.def;
	 * damage = damage <= 0 ? 1 : damage;
	 * m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
	 * System.out.println(name + "가 공격으로 " + m.name + "에게"
     + damage + "만큼 데미지를 주었습니다.");
	 * System.out.pringln(m.name + "의 현재 HP : " + m.hp);
	 */
    }

    //경험치를 얻는 메서드
    void getExp(int exp){
        System.out.println(exp + "의 경험치를 획득하였습니다.");
        this.exp += exp;
        while(100 <= this.exp){
            levelUp();
            this.exp -= 100;
        }
    }

    //레벨업 메서드
    void levelUp() {
        level++;
        maxHp += 10;
        maxMp += 5;
        att += 2;
        def += 2;
        hp = maxHp;
        mp = maxMp;
        System.out.println("LEVEL UP!!");

        //int value=0;
        //level=exp>=100+vlaue ?level++:level;
        //value +=5;
    }
}
