package utils;

import dto.Aquarium;
import dto.Fish;
import enums.Gender;

public class FishFactory {

    public static final int liveTime = 30;
    public static final int x = 5;
    public static final int y = 5;
    public static final int initialCount = 5;

    public static final int size = x*y;

    public static Fish generate(Aquarium aquarium) {
        Gender g = RandomFish.getRandomGender();

        int live = RandomFish.getRandom(liveTime);

        return new Fish(aquarium,RandomFish.getRandom(x+1),RandomFish.getRandom(y+1),g,live);
    }
}

