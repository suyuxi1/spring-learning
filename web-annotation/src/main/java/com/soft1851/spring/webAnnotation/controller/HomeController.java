package com.soft1851.spring.webAnnotation.controller;

import com.soft1851.spring.webAnnotation.entity.User;
import com.soft1851.spring.webAnnotation.entity.Wallpaper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @author su
 * @className HomeController
 * @Description TODO
 * @Date 2020/3/24 9:46
 * @Version 1.0
 **/
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("message","hello");
        Wallpaper[] wallpapers = {
                new Wallpaper(1, "111", "http://hd.wallpaperswide.com/thumbs/need_for_speed_heat_video_game_2-t2.jpg"),
                new Wallpaper(2, "222", "http://hd.wallpaperswide.com/thumbs/beautiful_moraine_lake_sunrise-t2.jpg"),
                new Wallpaper(3, "333", "http://hd.wallpaperswide.com/thumbs/stunning_view-t2.jpg"),
                new Wallpaper(4, "222", "http://hd.wallpaperswide.com/thumbs/hills_landscape-t2.jpg"),
                new Wallpaper(5, "2247", "http://hd.wallpaperswide.com/thumbs/lower_falls_of_the_yellowstone_river_sunrise-t2.jpg"),
                new Wallpaper(6, "4445", "http://hd.wallpaperswide.com/thumbs/path_forest_bluebells_spring-t2.jpg"),
                new Wallpaper(7, "111", "http://hd.wallpaperswide.com/thumbs/need_for_speed_heat_video_game_2-t2.jpg"),
                new Wallpaper(8, "222", "http://hd.wallpaperswide.com/thumbs/beautiful_moraine_lake_sunrise-t2.jpg"),
                new Wallpaper(9, "333", "http://hd.wallpaperswide.com/thumbs/stunning_view-t2.jpg"),
                new Wallpaper(10, "222", "http://hd.wallpaperswide.com/thumbs/hills_landscape-t2.jpg"),
                new Wallpaper(11, "2247", "http://hd.wallpaperswide.com/thumbs/lower_falls_of_the_yellowstone_river_sunrise-t2.jpg"),
                new Wallpaper(12, "4445", "http://hd.wallpaperswide.com/thumbs/path_forest_bluebells_spring-t2.jpg"),
                new Wallpaper(13, "111", "http://hd.wallpaperswide.com/thumbs/need_for_speed_heat_video_game_2-t2.jpg"),
                new Wallpaper(14, "222", "http://hd.wallpaperswide.com/thumbs/beautiful_moraine_lake_sunrise-t2.jpg"),
                new Wallpaper(15, "333", "http://hd.wallpaperswide.com/thumbs/stunning_view-t2.jpg"),
                new Wallpaper(16, "222", "http://hd.wallpaperswide.com/thumbs/hills_landscape-t2.jpg"),
                new Wallpaper(17, "2247", "http://hd.wallpaperswide.com/thumbs/lower_falls_of_the_yellowstone_river_sunrise-t2.jpg"),
                new Wallpaper(18, "4445", "http://hd.wallpaperswide.com/thumbs/path_forest_bluebells_spring-t2.jpg"),
                new Wallpaper(19, "2247", "http://hd.wallpaperswide.com/thumbs/lower_falls_of_the_yellowstone_river_sunrise-t2.jpg"),
                new Wallpaper(20, "4445", "http://hd.wallpaperswide.com/thumbs/path_forest_bluebells_spring-t2.jpg"),
                new Wallpaper(21, "111", "http://hd.wallpaperswide.com/thumbs/need_for_speed_heat_video_game_2-t2.jpg"),
                new Wallpaper(22, "222", "http://hd.wallpaperswide.com/thumbs/beautiful_moraine_lake_sunrise-t2.jpg"),
                new Wallpaper(23, "333", "http://hd.wallpaperswide.com/thumbs/stunning_view-t2.jpg"),
                new Wallpaper(24, "222", "http://hd.wallpaperswide.com/thumbs/hills_landscape-t2.jpg"),
                new Wallpaper(25, "2247", "http://hd.wallpaperswide.com/thumbs/lower_falls_of_the_yellowstone_river_sunrise-t2.jpg"),
                new Wallpaper(26, "4445", "http://hd.wallpaperswide.com/thumbs/path_forest_bluebells_spring-t2.jpg"),
                new Wallpaper(27, "111", "http://hd.wallpaperswide.com/thumbs/need_for_speed_heat_video_game_2-t2.jpg"),
                new Wallpaper(28, "222", "http://hd.wallpaperswide.com/thumbs/beautiful_moraine_lake_sunrise-t2.jpg"),
                new Wallpaper(29, "333", "http://hd.wallpaperswide.com/thumbs/stunning_view-t2.jpg"),
                new Wallpaper(30, "222", "http://hd.wallpaperswide.com/thumbs/hills_landscape-t2.jpg"),
                new Wallpaper(31, "2247", "http://hd.wallpaperswide.com/thumbs/lower_falls_of_the_yellowstone_river_sunrise-t2.jpg"),
                new Wallpaper(32, "4445", "http://hd.wallpaperswide.com/thumbs/path_forest_bluebells_spring-t2.jpg"),
                new Wallpaper(33, "111", "http://hd.wallpaperswide.com/thumbs/need_for_speed_heat_video_game_2-t2.jpg"),
                new Wallpaper(34, "222", "http://hd.wallpaperswide.com/thumbs/beautiful_moraine_lake_sunrise-t2.jpg"),
                new Wallpaper(35, "333", "http://hd.wallpaperswide.com/thumbs/stunning_view-t2.jpg"),
                new Wallpaper(36, "222", "http://hd.wallpaperswide.com/thumbs/hills_landscape-t2.jpg"),
                new Wallpaper(37, "2247", "http://hd.wallpaperswide.com/thumbs/lower_falls_of_the_yellowstone_river_sunrise-t2.jpg"),
                new Wallpaper(38, "4445", "http://hd.wallpaperswide.com/thumbs/path_forest_bluebells_spring-t2.jpg"),
                new Wallpaper(39, "2247", "http://hd.wallpaperswide.com/thumbs/lower_falls_of_the_yellowstone_river_sunrise-t2.jpg"),
                new Wallpaper(40, "4445", "http://hd.wallpaperswide.com/thumbs/path_forest_bluebells_spring-t2.jpg")
        };
        List<Wallpaper> wallpaperList = Arrays.asList(wallpapers);
        model.addAttribute("wallpaperList",wallpaperList);
        User user = new User(1,"su","13457513856");
        model.addAttribute("user",user);
        return "home";
    }

}
