public class MusicLibrary {
    private Album[] library;

    public MusicLibrary() {
        library = new Album[10];
    }

    //looks for spot that is null, adds album to that location
    //then return true
    //if no null spots, don't add return false
    public boolean add(Album album) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = album;
                return true;
            }
        }
        return false;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < library.length && library[index] != null) {
            library[index] = null;
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (Album a : library) {
            if (a != null) {
                result += a.toString() + "\n";
            } else {
                result += "EMPTY \n";
            }
        }
        return result;
    }


    public int findTitle(String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null && library[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }


    public int findArtist(String artist) {
        for (int i = 0; i < library.length; i++) {
            if (library[i].equals(artist)) {
                return i;
            }
        }
        return -1;
    }


    public Album getAlbum(int index) {
        if (index >= 0 && index < library.length) {
            return library[index];
        } else {
            System.out.println("index out of bounds");
            return null;
        }
    }

    public void sortByTitle() {
        Album temp;
        int min;
        for (int i = 0; i < library.length; i++) {
            min = i;
            for (int scan = i + 1; scan < library.length; scan++) {
                if (library[scan] != null && library[i] != null) {
                    if (library[scan].getTitle().compareTo(library[min].getTitle()) < 0) {
                        min = scan;
                    }
                }
                temp = library[min];
                library[min] = library[i];
                library[i] = temp;
            }
        }
    }

    public void sortByArtist(){
        for (int i = 0; i < library.length ; i++) {
            Album key = library[i];
            int position = i;

            while(position > 0 && library[position - 1] != null && key != null && library[position - 1].getArtist().compareTo(key.getArtist()) > 0){
                library[position] = library[position - 1];
                position--;
            }
            library[position] = key;
        }
    }

    public int binarySearchByTitle(String target){
        sortByTitle();
        int low = 0, high = library.length - 1, middle = (low + high)/2;
    while(library[middle].getTitle().equals(target) && low <= high){
        if(target.compareTo(library[middle].getTitle()) < 0){
            high = middle - 1;
        } else {
            low = middle + 1;
            middle = (low + high)/2;
        }
    }
    if(library[middle].getTitle().equals(target)){
        return middle;
    }else {
        return -1;
    }
    }

    public int binarySearchByArtist(String target){
        sortByArtist();
        int low = 0, high = library.length - 1, middle = (low + high)/2;
        while(library[middle].getArtist().equals(target) && low <= high){
            if(target.compareTo(library[middle].getArtist()) < 0){
                high = middle - 1;
            } else {
                low = middle + 1;
                middle = (low + high)/2;
            }
        }
        if(library[middle].getArtist().equals(target)){
            return middle;
        }else {
            return -1;
        }
    }


}
