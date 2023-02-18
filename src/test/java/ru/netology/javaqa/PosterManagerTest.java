package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void testFindAll() {
        String poster1 = "Movie1";
        String poster2 = "Movie2";
        String poster3 = "Movie3";

        PosterManager manager = new PosterManager();
        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);

        String[] actual = manager.findAll();
        String[] expected = {poster1, poster2, poster3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithoutParam1() {
        String poster1 = "Movie1";

        PosterManager manager = new PosterManager();
        manager.addPoster(poster1);


        String[] actual = manager.findLast();
        String[] expected = {poster1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithoutParam2() {
        String poster1 = "Movie1";
        String poster2 = "Movie2";
        String poster3 = "Movie3";
        String poster4 = "Movie4";
        String poster5 = "Movie5";

        PosterManager manager = new PosterManager();
        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);

        String[] actual = manager.findLast();
        String[] expected = {poster5, poster4, poster3, poster2, poster1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithoutParam3() {
        String poster1 = "Movie1";
        String poster2 = "Movie2";
        String poster3 = "Movie3";
        String poster4 = "Movie4";
        String poster5 = "Movie5";
        String poster6 = "Movie6";
        String poster7 = "Movie7";
        String poster8 = "Movie8";
        String poster9 = "Movie9";

        PosterManager manager = new PosterManager();
        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);
        manager.addPoster(poster7);
        manager.addPoster(poster8);
        manager.addPoster(poster9);

        String[] actual = manager.findLast();
        String[] expected = {poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithoutParam4() {
        String poster1 = "Movie1";
        String poster2 = "Movie2";
        String poster3 = "Movie3";
        String poster4 = "Movie4";
        String poster5 = "Movie5";
        String poster6 = "Movie6";
        String poster7 = "Movie7";
        String poster8 = "Movie8";
        String poster9 = "Movie9";
        String poster10 = "Movie10";

        PosterManager manager = new PosterManager();
        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);
        manager.addPoster(poster7);
        manager.addPoster(poster8);
        manager.addPoster(poster9);
        manager.addPoster(poster10);

        String[] actual = manager.findLast();
        String[] expected = {poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithoutParam5() {
        String poster1 = "Movie1";
        String poster2 = "Movie2";
        String poster3 = "Movie3";
        String poster4 = "Movie4";
        String poster5 = "Movie5";
        String poster6 = "Movie6";
        String poster7 = "Movie7";
        String poster8 = "Movie8";
        String poster9 = "Movie9";
        String poster10 = "Movie10";
        String poster11 = "Movie11";

        PosterManager manager = new PosterManager();
        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);
        manager.addPoster(poster7);
        manager.addPoster(poster8);
        manager.addPoster(poster9);
        manager.addPoster(poster10);
        manager.addPoster(poster11);

        String[] actual = manager.findLast();
        String[] expected = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithParam1() {
        String poster1 = "Movie1";
        String poster2 = "Movie2";
        String poster3 = "Movie3";
        String poster4 = "Movie4";
        String poster5 = "Movie5";
        String poster6 = "Movie6";

        PosterManager manager = new PosterManager(5);
        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);

        String[] actual = manager.findLast();
        String[] expected = {poster6, poster5, poster4, poster3, poster2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithParam2() {
        String poster1 = "Movie1";
        String poster2 = "Movie2";
        String poster3 = "Movie3";
        String poster4 = "Movie4";
        String poster5 = "Movie5";
        String poster6 = "Movie6";
        String poster7 = "Movie7";
        String poster8 = "Movie8";
        String poster9 = "Movie9";
        String poster10 = "Movie10";
        String poster11 = "Movie11";

        PosterManager manager = new PosterManager(11);
        manager.addPoster(poster1);
        manager.addPoster(poster2);
        manager.addPoster(poster3);
        manager.addPoster(poster4);
        manager.addPoster(poster5);
        manager.addPoster(poster6);
        manager.addPoster(poster7);
        manager.addPoster(poster8);
        manager.addPoster(poster9);
        manager.addPoster(poster10);
        manager.addPoster(poster11);

        String[] actual = manager.findLast();
        String[] expected = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};

        Assertions.assertArrayEquals(expected, actual);
    }

}
