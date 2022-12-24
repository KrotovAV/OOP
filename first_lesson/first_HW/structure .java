import java.util.ArrayList;

class Structure {
    public Structure() {
    init();
    }

    public Db getDb() {
    return db;
    }

    Db db;
    Db init() {
    db = new Db();
    // Worker(int id, String firstName, String secondName, String surName, 
                                                // int date, int adres, int jobTitle, int accessLevel, int workExperience)
    Worker c1 = new Worker(1, "Свет","Игорь", "Ианович" 1, 2, 3, 1, 2);
    Worker c2 = new Worker(2, "Бобр","Святослав", "Ианович" 1, 2, 3, 1, 2);
    Worker c3 = new Worker(3, "Петров","Игорь", "Ианович" 3, 3, 2, 3, 3);
    Worker c4 = new Worker(4, "Паук", "Дмитрий", "Ианович" 3, 3, 1, 4, 4);

    FilmDirectorFactory fd = new FilmDirectorFactory();
    db.addFilmDirector(fd.getFilmDirector("Петров В.Н."));
    db.addFilmDirector(fd.getFilmDirector("Gtound K."));
    db.addFilmDirector(fd.getFilmDirector("Deby Dc"));

    db.jobTitle.add(new JobTitle(1, "Главный бухгалтер"));
    db.jobTitle.add(new JobTitle(2, "Водиель"));
    db.jobTitle.add(new JobTitle(3, "Менеджер"));
    db.jobTitle.add(new JobTitle(4, "Менедер"));

    db.date.add(new birthDate(1, "1995"));
    db.date.add(new birthDate(2, "1998"));
    db.date.add(new birthDate(3, "2002"));
    db.date.add(new birthDate(4, "2005"));

    db.worker.add(c1);
    db.worker.add(c2);
    db.worker.add(c3);
    db.worker.add(c4);

    db.genres.add(new Genre(1, "Ужасы"));
    db.genres.add(new Genre(2, "Драмма"));
    db.genres.add(new Genre(3, "Комедия"));

    FilmProducerFactory pf = new FilmProducerFactory();

    db.addFilmProducer(pf.getFilmProducer("Ленфильм"));
    db.addFilmProducer(pf.getFilmProducer("Марвел"));
    db.addFilmProducer(pf.getFilmProducer("Мосфильм"));
    db.addFilmProducer(pf.getFilmProducer("DC"));

    return db;
    }

}



