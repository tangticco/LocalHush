package Demodulation;

class DemodulationModule{

    public static void main(String[] args){
        System.out.println("Here it goes!");
        BlockingAudioList a_data = new BlockingAudioList(500);
        System.out.println(Library.getRandomBits(55));

        Demodulator curDemodule = new Demodulator(Library.MODE_SHORT);
        curDemodule.startDecoder("/Users/zhuofantang/Dropbox/Academic/CS/BOS490/LocalHush/Demodulation/TEST_180214_1.wav");
    }
}
