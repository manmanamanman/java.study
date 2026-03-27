package leiheduixiang.duotai;

public class Master {
    //因为父类包含子类，可以用父类来替代子类，实现各子类中相同方法的调用，即多态
    public void feed(Pet pet,int num){
        pet.feed(num);
    }
    //通过master来集中调用Dog与Cat的特有方法
    public void work(Pet pet){
        //通过instanceof判断传参中的对象是属于哪个类的实例化对象，判断出来后将传参强转至对应类的对象，然后调用对应的特有方法
        if(pet instanceof Dog){
            Dog dog=(Dog)pet;
            dog.dogwork();
        }else {
            Cat cat=(Cat)pet;
            cat.catwork();
        }
    }
}
