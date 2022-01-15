import User.*;
import Store.*;
import Shares.*;
import Message.*;
import Following.*;

public class Main {

	public static void main(String[] args) {
		User engin = new IndividualUser(1, "demirogengin", "HelloWrld12.", "engin.png", "Instructor", "Engin",
				"Demiroğ", 18);
		
		User turkcell = new BussinessUser(2, "Trcell", "BağlanHyt00,", "turk.jpg", "Geleceği Yazanlar",
				"Turkcell", "İstanbul");
		
		Store product1 = new Store(101, "Samsung Fold3", 18000, 1500, new String[] {}, "256GB katlanabilir telefon");
		
		DirectMessage message1 = new DirectMessage("Hello world", "Liked");
		
		DirectMessage call1 = new DirectMessage("You have 1 missed call from " + turkcell.getUsername());
		
		Share post1 = new Post(new String[]{"Anıtkabir Gezisi.jpg", "Aslanlı Yol.jpg"}, 1938,
				"Ankara'ya gelmişken Atamızı ziyaret etmeden olmaz", 
				new String[] {"Çok haklısınız. Kesinlikle unutturmamamız gerekiyor."});
		
		Following newFollower = new Follower(engin.getUsername(),engin.getProfilePicture(),turkcell.getUsername());
		
		Following toFollow = new ToFollow(turkcell.getUsername(),turkcell.getProfilePicture(),engin.getUsername());
	}

}
