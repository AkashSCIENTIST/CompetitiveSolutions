

int heron(triangle *t){
    int twop=t->a+t->b+t->c;
    return twop*(twop-2*t->a)*(twop-2*t->b)*(twop-2*t->c);
}

int heron_comp(const void *a, const void *b){
    return heron((triangle*)a) - heron((triangle*)b);
}

void sort_by_area(triangle* tr, int n) {
    qsort(tr, n, sizeof(*tr), heron_comp);
}

