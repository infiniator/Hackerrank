#include <stdio.h>
#include <stdlib.h>
int main() {
    int i, height = 0;
    int *h = malloc(sizeof(int) * 26);
    for(int h_i = 0; h_i < 26; h_i++){
       scanf("%d", &h[h_i]);
    }
    char* word = (char *)malloc(11 * sizeof(char));
    scanf("%s", word);
    for(i = 0; word[i] != '\0'; i++) {
        if(height < h[word[i] - 97])
            height = h[word[i] - 97];
    }
    printf("%d", i * height);
    return 0;
}
