#include"stdio.h"
char s[]="void print(char* t){$  int i;$  printf('%s',s);$  printf('/42;/n');$  for (i=0;i<sizeof(s);i++){$     if (s[i]==36) s[i]=10;$     if (s[i]==39) s[i]=34;$     if (s[i]==47) s[i]=92;$   }$  printf('%s',s);$  printf('/nmain()/n{/n  printf(/42#include//42stdio.h//42//nchar s[]=//42/42);/n  print(s);/n}');$}";
void print(char* t){
  int i;
  printf("%s",s);
  printf("\42;\n");
  for (i=0;i<sizeof(s);i++){
     if (s[i]==36) s[i]=10;
     if (s[i]==39) s[i]=34;
     if (s[i]==47) s[i]=92;
   }
  printf("%s",s);
  printf("\nmain()\n{\n  printf(\42#include\\42stdio.h\\42\\nchar s[]=\\42\42);\n  print(s);\n}");
}
main()
{
  printf("#include\42stdio.h\42\nchar s[]=\42");
  print(s);
}