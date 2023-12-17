package com.example.diansdomasna3.BootStrap;

import com.example.diansdomasna3.Model.Administrator;
import com.example.diansdomasna3.Model.User;
import com.example.diansdomasna3.Model.Wine;
import com.example.diansdomasna3.Model.Wineries;
import com.example.diansdomasna3.Model.enumerations.WineType;
import com.example.diansdomasna3.repository.jpa.AdminRepository;
import com.example.diansdomasna3.repository.jpa.UserRepository;
import com.example.diansdomasna3.repository.jpa.WineRepository;
import com.example.diansdomasna3.repository.jpa.WineriesRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class DataHolder {
    private final UserRepository userRepository;
    private final WineRepository wineRepository;
    private final WineriesRepository wineriesRepository;
    private final AdminRepository adminRepository;

    public DataHolder(UserRepository userRepository, WineRepository wineRepository, WineriesRepository wineriesRepository, AdminRepository adminRepository) {
        this.userRepository = userRepository;
        this.wineRepository = wineRepository;
        this.wineriesRepository = wineriesRepository;
        this.adminRepository = adminRepository;
    }

    @PostConstruct
    public void init()
    {
        List<User>users=new ArrayList<>();
        List<Wineries>wineries=new ArrayList<>();
        List<Wine> list = new ArrayList<>();
        List<Administrator>administrators=new ArrayList<>();
        if(userRepository.count()==0) {
            users.add(new User("Leonid", "Trajkoski", "leonid.trajkoski", "lt", "kosta_abrasevik", "16.01.2002"));
            users.add(new User("user", "Userski", "user.2", "ut", "address", "10.02.1999"));
            userRepository.saveAll(users);
        }
        if(adminRepository.count()==0)
        {
            administrators.add(new Administrator("Zvonko","Trajkoski","zvonko.trajkoski","zt"));
            adminRepository.saveAll(administrators);
        }
        if(wineriesRepository.count()==0) {
            wineries.add(new Wineries("Vinariska Vizba Tikves", list));
            wineries.add(new Wineries("Filovski vinarija", list));
            wineries.add(new Wineries("Bord lajf vinarii", list));
            wineries.add(new Wineries("Divino Vinarija", list));
            wineries.add(new Wineries("Vinarska Vizba Tikves-Prodavnica Centar", list));
            wineries.add(new Wineries("Vinar", list));
            wineries.add(new Wineries("Vinarija Brzanov", list));
            wineries.add(new Wineries("Vinarska Vizba Tikves", list));
            wineries.add(new Wineries("Vinarija Popov", list));
            wineries.add(new Wineries("Tristo Vinarii", list));
            wineries.add(new Wineries("Vinarija Ohrid", list));
            wineries.add(new Wineries("Stobi Vinarija", list));
            wineries.add(new Wineries("Lazar Vinarija", list));
            wineries.add(new Wineries("Kralska Vinarija-Kralica Marija", list));
            wineries.add(new Wineries("Vinarija Iliev", list));
            wineries.add(new Wineries("Vinarija Kimov", list));
            wineries.add(new Wineries("Semejna Vinarija Zaharcev", list));
            wineries.add(new Wineries("Vinarija Tomov", list));
            wineriesRepository.saveAll(wineries);
        }
        if(wineRepository.count()==0) {
            list.add(new Wine("Merlot", WineType.RED, 1000, LocalDate.of(2015, 1, 2), 5, wineries.get(0)));
            list.add(new Wine("Chianti", WineType.RED, 750, LocalDate.of(2018, 1, 1), 4, wineries.get(14)));
            list.add(new Wine("Smederevka", WineType.WHITE, 500, LocalDate.of(2020, 1, 1), 3, wineries.get(3)));
            list.add(new Wine("Chardonnay", WineType.WHITE, 750, LocalDate.of(2018, 7, 15), 5, wineries.get(1)));
            list.add(new Wine("Sauvignon Blanc", WineType.WHITE, 1000, LocalDate.of(2012, 12, 3), 4, wineries.get(15)));
            list.add(new Wine("Red Wine", WineType.RED, 1000, LocalDate.of(2016, 4, 20), 3, wineries.get(2)));
            list.add(new Wine("Syrah", WineType.RED, 500, LocalDate.of(2019, 11, 9), 5, wineries.get(13)));
            list.add(new Wine("Grenache", WineType.RED, 750, LocalDate.of(2011, 9, 22), 2, wineries.get(6)));
            list.add(new Wine("Tempranillo", WineType.RED, 500, LocalDate.of(2015, 2, 18), 4, wineries.get(5)));
            list.add(new Wine("Albarino", WineType.WHITE, 500, LocalDate.of(2014, 6, 9), 4, wineries.get(8)));
            list.add(new Wine("Pinot Noir", WineType.RED, 300, LocalDate.of(2013, 10, 31), 3, wineries.get(11)));
            list.add(new Wine("White Wine", WineType.WHITE, 750, LocalDate.of(2017, 1, 25), 5, wineries.get(12)));
            list.add(new Wine("Sparkling Wine", WineType.SPARKLING, 1000, LocalDate.of(2022, 8, 14), 2, wineries.get(9)));
            list.add(new Wine("Pinot Gris", WineType.WHITE, 500, LocalDate.of(2010, 5, 12), 5, wineries.get(7)));
            list.add(new Wine("Zinfandel", WineType.RED, 1000, LocalDate.of(2021, 3, 7), 3, wineries.get(10)));
            list.add(new Wine("Malbec", WineType.RED, 750, LocalDate.of(2010, 11, 29), 5, wineries.get(0)));
            list.add(new Wine("Viognier", WineType.WHITE, 300, LocalDate.of(2013, 5, 2), 2, wineries.get(16)));
            list.add(new Wine("Cabernet Sauvignon", WineType.RED, 300, LocalDate.of(2016, 9, 11), 4, wineries.get(17)));
            list.add(new Wine("Riesling", WineType.WHITE, 300, LocalDate.of(2014, 2, 26), 4, wineries.get(4)));
            list.add(new Wine("Chenin Blanc", WineType.WHITE, 300, LocalDate.of(2011, 7, 23), 5, wineries.get(0)));
            list.add(new Wine("Rosé", WineType.ROSE, 1000, LocalDate.of(2023, 1, 19), 5, wineries.get(10)));
            list.add(new Wine("Sangiovese", WineType.RED, 500, LocalDate.of(2018, 10, 30), 5, wineries.get(2)));
            list.add(new Wine("Dessert Wine", WineType.DESSERT, 1000, LocalDate.of(2017, 4, 3), 3, wineries.get(13)));
            list.add(new Wine("Fortified Wine", WineType.FORTIFIED, 300, LocalDate.of(2015, 3, 10), 5, wineries.get(4)));
            wineRepository.saveAll(list);
        }

    }

}
