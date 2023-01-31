package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

import behavioral.iterator.iterators.ProfileIterator;
import behavioral.iterator.profile.Profile;
import behavioral.iterator.social_networks.Facebook;
import behavioral.iterator.social_networks.SocialNetwork;

public class Main {
	   public static void main(String[] args) {
	        // test profilleri oluþtur
	        List<Profile> profiles = createTestProfiles();

	        SocialNetwork socialNetwork = new Facebook(profiles);
	        ProfileIterator iterator = socialNetwork.createFriendsIterator("halit@kodlama.io");
	        while(iterator.hasNext()){
	            Profile profile = iterator.getNext();
	            System.out.println("Bulunan arkadaþ: " + profile.getName());
	        }
	    }

	    public static List<Profile> createTestProfiles(){
	        List<Profile> profiles = new ArrayList<>();
	        profiles.add(new Profile("Halit","halit@kodlama.io","irem@kodlama.io","aysu@etiya.com","berkay@etiya.com"));
	        profiles.add(new Profile("Ýrem","irem@kodlama.io","halit@kodlama.io","aysu@etiya.com"));
	        profiles.add(new Profile("Aysu","aysu@etiya.com","halit@kodlama.io","irem@kodlama.io"));
	        profiles.add(new Profile("Berkay","berkay@etiya.com","halit@kodlama.io"));
	        return profiles;
	    }
	}