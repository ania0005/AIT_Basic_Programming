package ait.album.dao;

import ait.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class AlbumImpl implements Album {
    private Photo[] photos;
    private int size;

    public AlbumImpl(int capasity) {
        this.photos = new Photo[capasity];

    }

    @Override
    public boolean addPhoto(Photo photo) {
        if (photo == null || size == photos.length ||
                getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        for (int i = 0; i <size; i++) {
            for (int i = 0; i < size; i++) {
                if (photos[i].compareTo(photo) > 0) {
                    System.arraycopy(photos, i, photos, i+1, size - i);
                    photos[i] = photo;
                    size++;
                    return true;
                }

            }
          photos[size++] = photo;
          return true;
        }


    @Override
    public boolean removePhoto(int albumId, int photoId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                photos[i] = photos[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String newUrl) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                photos[i].setUrl(newUrl);
                return true;
            }
        }
        return false;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        Photo[] arrayAlbumId = new Photo[size];
        int counter = 0;
        for (int i = 0, j = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId) {
                arrayAlbumId[j++] = photos[i];
                counter++;
            }
        }
        if (counter > 0) {
           Photo[] result = Arrays.copyOf(arrayAlbumId, counter);
            return result;
        } else return new Photo[0];
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        LocalDateTime dateFromPlusTime = dateFrom.atStartOfDay();
        System.out.println(dateFromPlusTime);
        LocalDateTime dateToPlusTime = dateTo.atStartOfDay();
        System.out.println(dateToPlusTime);
        Photo[] arrayPhotoBetweenDate = new Photo[size];
        int counter = 0;
        for (int i = 0, j = 0; i < size; i++) {
            if (photos[i].getDate().isAfter(dateFromPlusTime) && photos[i].getDate().isBefore(dateToPlusTime)) {
                arrayPhotoBetweenDate[j++] = photos[i];
                counter++;
            }
        }
        if (counter > 0) {
            Photo[] result = Arrays.copyOf(arrayPhotoBetweenDate, counter);
            return result;
        } else return new Photo[0];

    }

    @Override
    public int size() {
            return size;
    }
}
