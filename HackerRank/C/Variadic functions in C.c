
int  sum (int count,...) {
    int sum=0;
    va_list values;
    va_start(values,count);
    for(int i=0;i<count;i++){
        sum+=va_arg(values,int);
    }
    va_end(values);
    return sum;
}

int min(int count,...) {
    int min=MAX_ELEMENT,test;  
    va_list values;
    va_start(values,count);
    for(int i=0;i<count;i++){
        test=va_arg(values,int);
        if(min>test){
            min=test;
        }  
    }
    va_end(values);
    return min;
}

int max(int count,...) {
    int max=MIN_ELEMENT,test;
    va_list values;
    va_start(values,count);
    for(int i=0;i<count;i++){
        test=va_arg(values,int);
        if(max<test){
            max=test;
        }  
    }
    va_end(values);
    return max;
}

