

typedef struct {
    int height;
    int length;
    int width;
}box;

int get_volume(box b) {
    return b.length * b.height * b.width;
}

int is_lower_than_max_height(box b) {
    return b.height < 41 ? 1 : 0;
}

