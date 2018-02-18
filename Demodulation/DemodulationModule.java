package Demodulation;

class DemodulationModule{


    public static void main(String[] args){
        System.out.println("Here it goes!");
        BlockingAudioList a_data = new BlockingAudioList(500);
        System.out.println(Library.getRandomBits(55));
    }
}
